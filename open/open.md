# 开放

椒盐音乐提供部分外部修改椒盐音乐相关设置属性的功能。

| 常量 | 值 |
| :-- | :-- |
| ACTION_SALT_PLAYER_TOOLS | "com.salt.music.TOOLS" |
| PACKAGE_NAME_SALT_PLAYER | "com.salt.music" |
| EXTRA_KEY | "extra_string_key" |
| EXTRA_VALUE | "extra_string_value" |


#### 无级修改歌词界面文本大小

`支持椒盐音乐 3.10.2-release-2021090601 及更新版本。`

| key | value |
| :-- | :-- |
| lyrics_view_text_size | Int |

```kotlin
// Example, set lyrics view textsize to 50
val key = "lyrics_view_text_size"
val value = "50"
val intent = Intent().apply {
    action = ACTION_SALT_PLAYER_TOOLS
    setPackage(PACKAGE_NAME_SALT_PLAYER)
    putExtra(EXTRA_KEY, key)
    putExtra(EXTRA_VALUE, value)
}
context.sendBroadcast(intent)
```