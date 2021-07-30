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

package com.salt.music.player

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.audiofx.AudioEffect
import android.view.animation.LinearInterpolator

/**
 * 音频播放器（部分源码，淡入淡出部分）
 * 由 MediaPlayer 拓展，使用很简单
 *
 * AudioPlayer (Part of the source code)
 * The android.media.MediaPlayer extensions for audio play.
 * It is very easy to use.
 *
 * @version 20210730
 * @author Moriafly
 * @since 2021/07/26
 */
class AudioPlayer(): MediaPlayer() {

    private var volume = 1F

    var volumeSmoothDuration: Long = 500L
        set(value) {
            pauseSmoothValueAnimator.duration = value
            startSmoothValueAnimator.duration = value
            field = value
        }

    private val pauseSmoothValueAnimator = ValueAnimator.ofFloat(1F, 0F).apply {
        duration = volumeSmoothDuration
        interpolator = LinearInterpolator()
        addUpdateListener {
            volume = it.animatedValue as Float
            try {
                setVolume(volume, volume)
            } catch (e: Exception) {
                it.cancel()
            }
        }
        addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                this@AudioPlayer.setVolume(0F, 0F)
                this@AudioPlayer.pause()
                isPauseSmoothing = false
            }

            override fun onAnimationCancel(animation: Animator?) {
                isPauseSmoothing = false
            }

            override fun onAnimationRepeat(animation: Animator?) { }
        })
    }

    private val startSmoothValueAnimator = ValueAnimator.ofFloat(0F, 1F).apply {
        duration = volumeSmoothDuration
        interpolator = LinearInterpolator()
        addUpdateListener {
            volume = it.animatedValue as Float
            try {
                setVolume(volume, volume)
            } catch (e: Exception) {
                it.cancel()
            }
        }
        addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                this@AudioPlayer.start()
            }

            override fun onAnimationEnd(animation: Animator?) {
                this@AudioPlayer.setVolume(1F, 1F)
                isStartSmoothing = false
            }

            override fun onAnimationCancel(animation: Animator?) {
                isStartSmoothing = false
            }

            override fun onAnimationRepeat(animation: Animator?) { }
        })
    }

    var leftChannel: Float = 1F

    var rightChannel: Float = 1F

    private var isPauseSmoothing: Boolean = false

    private var isStartSmoothing: Boolean = false

    override fun isPlaying(): Boolean {
        if (isPauseSmoothing) {
            return false
        }
        if (isStartSmoothing) {
            return true
        }
        return super.isPlaying()
    }

    fun pauseSmooth() {
        isPauseSmoothing = true
        startSmoothValueAnimator.cancel()
        pauseSmoothValueAnimator.start()
    }

    fun startSmooth() {
        isStartSmoothing = true
        pauseSmoothValueAnimator.cancel()
        startSmoothValueAnimator.start()
    }

    override fun setVolume(leftVolume: Float, rightVolume: Float) {
        super.setVolume(
            leftVolume * leftChannel,
            rightVolume * rightChannel
        )
    }

    override fun reset() {
        pauseSmoothValueAnimator.cancel()
        startSmoothValueAnimator.cancel()
        super.reset()
    }

}