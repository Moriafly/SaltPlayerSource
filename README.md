# 椒盐音乐 Salt Player

[官方网站 HiMoriafly Salt Player](https://moriafly.xyz/HiMoriafly/)

使用 Jetpack Compose 开发的 Android 音乐播放器软件。

本仓库是用来发布更新椒盐音乐新版本、收集反馈、发布一些通知的，而不是椒盐音乐的完整项目代码开源库。椒盐音乐属于<b>闭源软件</b>。

## 软件功能

椒盐音乐是一款 Android 平台本地音乐播放软件。

### 音频输出

- 强大的音频功能，AudioTrack / OpenSL ES / AAudio 输出，44.1 kHz - 384 kHz 采样率转换（具体实际效果和设备相关）
- MP3 / AAC / FLAC / WAV / OPUS / WV / DSF / DFF /APE / OGG / M4A / ALAC / AIFF 格式
- DSD D2P 设置
- 音频焦点 / 音量平衡 / 播放淡入淡出
- 倍数播放，最小 0.25 倍，最大 50 倍
- 系统均衡器 / MISOUND 等音效处理
- 内置 SALT PLAYER AUDIOFX V4
- 内置 MAX Audio 音乐厅氛围
- 压限器（Compressor）
- 内置多种耳机定制音效
- 内置 V3 混响功能
- 浮点解码 / DSP 输出
- 娱乐性倒放功能
- 导入自定义参数均衡
- 抗锯齿过滤器（Anti-Alias Filter）
- 自动播放功能

### 音乐管理

- 强大是扫描音乐功能，同时 Android 媒体库扫描 + 自定义文件夹扫描
- 专辑 / 艺术家 / 文件夹分类
- WAV / APE 格式元数据
- 统一的 UTF-8 ，免受使用 Android 媒体库可能带来的乱码问题
- 无限歌单，无限歌单内歌曲
- 音乐库统计歌曲数量大小等
- 播放次数统计
- 音质标签
- 分享歌曲

### 界面交互

- 高清内嵌图读取
- 简洁现代的 UI 界面，更优秀的交互体验
- 自定义软件主界面 / 播放界面壁纸
- 内置流光播放界面特效
- 主界面 / 播放界面浅色 / 深色 / 跟随系统设置
- 竖屏 / 横屏 / 平板模式
- 沉浸模式
- 隐藏状态栏
- 在列表中显示歌曲文件名
- 在列表中显示添加下一首播放
- 播放界面保存屏幕唤醒
- 默认样式 / 圆形滚动封面
- 歌词视图文本居中对齐
- 显示大小缩放

### 歌词功能

- 多种音频格式的内嵌歌词， LRC 歌词（多种编码）
- 滚动歌词
- 翻译歌词功能
- 迷你播放条歌词
- 桌面歌词
- 悬浮窗状态栏歌词
- 车载蓝牙歌词
- Xposed 状态栏歌词

### 强大适配

- 魅族 Flyme 等系统级状态栏歌词
- 调用音乐标签软件修改标签
- Hearusy Spectrum 查看时频谱图
- 支持比亚迪车机语音（配合音乐助手 App）
- 支持 MIUI / OneUI 媒体路由调用等

## 下载地址

`请在正确的渠道下载本应用，请勿使用他人重新签名的安装文件。`

|  [Github release](https://github.com/Moriafly/SaltPlayerSource/releases)   | [Google Play](https://play.google.com/store/apps/details?id=com.salt.music)  | [酷安](https://www.coolapk.com/apk/284064) | [ApkPure](https://apkpure.com/p/com.salt.music) |
|:--:|:--:|:--:|:--:|
| 同时发布标准渠道（Moriafly）和鸿蒙版（Hmos） | 发布谷歌渠道版本 | 首发正式版 | ApkPure 非官方上传，同谷歌渠道版本 |

## 开放文档

[点击查看开放文档](open/open.md)

## 使用帮助

[FQA](https://moriafly.xyz/HiMoriafly/docs/salt-player/FQA)

## 寻求帮助

[AndroidUsbAudio](https://github.com/Moriafly/AndroidUsbAudio)

## 可以通过提交 issue 来反馈你在椒盐音乐使用中遇到的问题

![错误 bug](https://img.shields.io/github/issues/Moriafly/SaltPlayerSource/错误%20bug?color=d73a4a&label=错误%20bug) ![增强 enhancement](https://img.shields.io/github/issues/Moriafly/SaltPlayerSource/增强%20enhancement?color=a2eeef&label=增强%20enhancement)

建议先查看应用内帮助文档哦，若无法解决请提交 issue 。特别注意，多问题请分开提交多个 issue ，请勿写在一起~

## 本地化适配

可以提交到 [translations](https://github.com/Moriafly/SaltPlayerSource/tree/main/translations) 中帮助翻译哦~

## 版本说明

椒盐音乐安装包大小约 8 MB ，解压安装后约占用 30 MB 空间（后续使用产生的用户数据不包含）。
**仅提供 64 位版本（架构 arm-v8a），需要安卓 6.0 以上。**

**Google Play 版本由谷歌签名发布，与此仓库安装包不兼容。**

___

本软件相关音频技术已获授权。