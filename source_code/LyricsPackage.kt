/**
 * SaltPlayerSource  Copyright (C) 2021  Moriafly
 * This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 * This is free software, and you are welcome to redistribute it
 * under certain conditions; type `show c' for details.
 *
 * The hypothetical commands `show w' and `show c' should show the appropriate
 * parts of the General Public License.  Of course, your program's commands
 * might be different; for a GUI interface, you would use an "about box".
 *
 * You should also get your employer (if you work as a programmer) or school,
 * if any, to sign a "copyright disclaimer" for the program, if necessary.
 * For more information on this, and how to apply and follow the GNU GPL, see
 * <https://www.gnu.org/licenses/>.
 *
 * The GNU General Public License does not permit incorporating your program
 * into proprietary programs.  If your program is a subroutine library, you
 * may consider it more useful to permit linking proprietary applications with
 * the library.  If this is what you want to do, use the GNU Lesser General
 * Public License instead of this License.  But first, please read
 * <https://www.gnu.org/licenses/why-not-lgpl.html>.
 */

package com.salt.music.service.lyrics

import com.salt.music.player.UnstableApi
import java.util.HashMap
import java.util.regex.Pattern

/**
 * 歌词包
 * 解析歌词为 Entry，同时支持同时间戳翻译、1 - 6 位毫秒时间戳解析
 *
 * @author Moriafly
 * @since 2022-02-23
 */
@UnstableApi
class LyricsPackage(
    lyricsPackageSource: LyricsPackageSource,
    text: String?,
) {

    /** 歌词来源 */
    var source: LyricsPackageSource = LyricsPackageSource.EMBEDDED

    /** 是否支持时间戳滚动 */
    var canTimeScroll: Boolean = false

    /** 歌词单元集合 */
    var entryList: List<Entry>? = null

    /** 解析歌词 */
    private fun paresText(sourceText: String?): List<Entry>? {
        if (sourceText.isNullOrEmpty()) return null
        // 开始解析每一行
        var lyricText = sourceText
        val lyricsEntryList = ArrayList<Entry>()
        if (lyricText.startsWith("\uFEFF")) {
            lyricText = lyricText.replace("\uFEFF", "")
        }
        val array = lyricText.split("\\n".toRegex()).toTypedArray()
        array.forEach {
            parseLine(it)?.let { lyricsEntry ->
                lyricsEntryList.add(lyricsEntry)
            }
        }
        // 一行都没解析出来则返回空
        if (lyricsEntryList.isEmpty()) return null
        // 排序
        val map = HashMap<Long, Entry>()
        for (lyric in lyricsEntryList) {
            if (map.containsKey(lyric.time)) {
                // 同时间戳歌词以 \n + 翻译歌词添加在后
                map[lyric.time]?.lyrics += "\n" + lyric.lyrics
                continue
            }
            map[lyric.time] = lyric
        }
        val newList = ArrayList<Entry>()
        for (i in map) {
            newList.add(i.value)
        }
        val sortedList = newList.sortedBy {
            it.time
        }
        return if (sortedList.isEmpty()) null else newList
    }

    /**
     * 解析每一行，支持时间戳毫秒最多 6 位
     *
     * Parse [lyricsString]
     */
    private fun parseLine(lyricsString: String): Entry? {
        var lyrics = lyricsString
        // 如果为空
        if (lyrics.isEmpty()) return null
        lyrics = lyrics.trim { it <= ' ' }
        // [00:24.61]雪花飘 青山遇绝壁
        val lineMatcher = PATTERN_LINE.matcher(lyrics)
        if (!lineMatcher.matches()) {
            return null
        }
        val times = lineMatcher.group(1) ?: ""
        val text = lineMatcher.group(3) ?: ""
        // [00:17.65]
        val timeMatcher = PATTERN_TIME.matcher(times)
        if (timeMatcher.find()) {
            val min = (timeMatcher.group(1) ?: "").toLong()
            val sec = (timeMatcher.group(2) ?: "").toLong()
            val milString = timeMatcher.group(3) ?: ""
            var mil = milString.toLong()
            // 如果毫秒是两位数，需要乘以 10
            when (milString.length) {
                1 -> mil *= 100
                2 -> mil *= 10
                4 -> mil /= 10
                5 -> mil /= 100
                6 -> mil /= 1000
            }
            val time = min * MINUTE_IN_MILLIS + sec * SECOND_IN_MILLIS + mil
            return Entry(time, text)
        }
        return null
    }

    /** 单元歌词（同时间戳歌词） */
    data class Entry(
        val time: Long,
        var lyrics: String
    ) {
        /** 主歌词 [0] */
        var main: String? = null

        /** 翻译歌词 [1] */
        var sub: String? = null

        init {
            val stringList = lyrics.split('\n', limit = 2)
            if (stringList.isNotEmpty()) {
                main = stringList[0]
            }
            if (stringList.size >= 2) {
                sub = stringList[1]
            }
        }
    }

    init {
        source = lyricsPackageSource
        if (text.isNullOrEmpty()) {
            canTimeScroll = false
        } else {
            entryList = paresText(text)
            canTimeScroll = !entryList.isNullOrEmpty()
        }
    }

    companion object {
        // 时间戳匹配
        private val PATTERN_TIME = Pattern.compile("\\[(\\d\\d):(\\d\\d)\\.(\\d{1,6})]")
        // 行匹配
        private val PATTERN_LINE = Pattern.compile("((\\[\\d\\d:\\d\\d\\.\\d{1,6}])+)(.+)")

        private const val MINUTE_IN_MILLIS = 60_000L
        private const val SECOND_IN_MILLIS = 1000L
    }

}

/**
 * 歌词来源
 */
enum class LyricsPackageSource {
    EMBEDDED, // 内嵌
    LRC_FILE, // lrc 文件
    INTERNET // 网络歌词
}