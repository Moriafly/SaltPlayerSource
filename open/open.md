# 开放文档

椒盐音乐提供部分外部修改椒盐音乐相关设置属性的功能。

## 自定义参数均衡

操作位于椒盐音乐【设置】-【椒盐音乐 Pro】`*1`-【导入自定义参数均衡】。

#### 为什么使用均衡器？

1. 用以弥补一下耳机的公认缺陷。

2. 不同人听感不同，有人喜欢低、有人喜欢高。

3. 最适合你的才是最好的，**开心**最重要。

#### 参数均衡器（Parametric Equalizer）

参数均衡器是一种功能非凡的音调调节形式。不同于图形均衡器的只能对相对固定的频段进行提升和降低，参数均衡器可以对全频段上的任何一个频率进行操作。

#### 参数说明

| 参数 | 类型 | 说明 |
| :-- | :-- | :-- |
| name | String | 此参数均衡的名称，如：Mega bass |
| author | String | 此参数均衡的作者 |
| preamp | Float | 前置放大器值，单位为分贝（dB），范围：-15.0-15.0 |
| F | Float | 中心频率值，设定了你要对声音频带中进行均衡的具体频段。单位为赫兹（Hz），推荐范围：20-20000 |
| G | Float| 增益量值，决定了你要对选定频段进行提升或是衰减的程度。单位为分贝（dB），推荐范围：-15.0-15.0 |
| Q | Float| 品质因数 Q 值，此参数影响带宽，决定了提升或是衰减曲线是窄而尖还是宽而平缓。较窄的带宽设置（即较高的共振或是 Q 值）使得均衡器只能对非常窄的一个音频段进行操作，而较宽的设定值则可以对较宽的音频段进行操作。Q 值越大，滤波器越尖锐，调节范围越小，反之 Q 值越小调节范围越大。范围：0-10 |

`*2`

#### 关于 items 数量说明

原理上不限制 items 的数量，但是我们推荐使用 5-10 个。

1. 即使是 5 级的图形均衡即可达到很好的效果。

2. 过高的控制数量将造成性能问题，处理过多的峰值控制会严重占用 CPU 。

3. AutoEq 库一般在参数均衡使用 10 个控制点。

#### 例子

本例子仅作格式演示：

```json
{
    "name": "这是名字",
    "author": "小盐",
    "preamp": 10,
    "items": [
        {
            "F": 21.0,
            "G": 1.1,
            "Q": 2.71
        },
        {
            "F": 539.0,
            "G": -4.4,
            "Q": 1.17
        },
        {
            "F": 1534.0,
            "G": -2.1,
            "Q": 1.32
        }
    ]
}
```

#### 详见

 [v4_eq_demo.json](https://github.com/Moriafly/SaltPlayerSource/blob/main/open/v4_eq_demo.json)。

#### 推荐参考网站

[https://github.com/jaakkopasanen/AutoEq/blob/master/results/INDEX.md](https://github.com/jaakkopasanen/AutoEq/blob/master/results/INDEX.md)

[https://reference-audio-analyzer.pro/](https://reference-audio-analyzer.pro/)

---

`*1` 此为收费项目，你需要购买【椒盐音乐 Pro】。
`*2` 部分信息来源网络。

## 广播

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

## 面向开发者等合作

如需要相关合作，请于 SaltPlayerSource 提交 issue ，会与你取得联系。