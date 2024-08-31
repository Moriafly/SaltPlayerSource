<img src="src/App GitHub Header.png" width="100%"/>

# Salt Player 数十万用户选择的本地音乐播放器

本页翻译：[Русский](https://github.com/Moriafly/SaltPlayerSource/tree/main/README-RU.md)，[Indonesia](https://github.com/Moriafly/SaltPlayerSource/tree/main/README-ID.md)

Salt Player 是一款本地音乐播放软件，本仓库用来发布新版本、收集反馈和发布通知

## 下载渠道

### Android

Salt Player *for Android* 需要 Android 6.0 及以上系统，支持 arm-v8a 以及 armeabi-v7a 架构

| 渠道 | 介绍 | 发布 |
|:--|:--|:--|
| Moriafly | 标准包 | [Github Release](https://github.com/Moriafly/SaltPlayerSource/releases) <br> [酷安](https://www.coolapk.com/apk/284064)（仅 arm-v8a 架构） |
| Google Play | Play 商店渠道包 | [Google Play](https://play.google.com/store/apps/details?id=com.salt.music)（动态下发） |

注意：

1. 请在正确的渠道下载本应用，请勿使用未知签名来源的安装文件
2. Google Play 版本由谷歌签名发布，与此仓库安装包不兼容

### Windows

<img src="src/spw.png" height="128px"/>

详见 [SPW](https://github.com/Moriafly/SPW) 说明文件

## 开源相关

[Salt UI](https://github.com/Moriafly/SaltUI)

## 本地化适配

详见 [Translations](https://github.com/Moriafly/SaltPlayerSource/tree/main/translations) 说明文件

## 系统适配

| 系统 | 功能 | 状态 | 说明 |
|:--|:--|:--|:--|
| 小米 MIUI/Hyper OS | 小米妙播 | 🟢 支持 | 1. 调用小米妙播功能需要 MIUI 12 及以上版本，点击 Salt Player 播放界面右上角按钮自动跳转 <br> 2. 此功能基于小米投屏相关系统组件，若无效请检测是否禁用了相关组件 |
| | MIUI/Hyper OS 小部件 | 🟠 跟进中 | 等待上架以及上架后审核 |
| 华为鸿蒙 | 音乐控制中心 | 🔴 不支持 | 白名单控制以及未发现适配文档 |
| vivo OriginOS/Funtouch OS | Hi-Fi | 🔵 手动 | 1. 通过 adb 的方式输入 `settings put global game_support_hifi_list com.salt.music` 添加 <br> 2. 添加 Salt Player 进入 Hi-Fi 列表后，进入系统设置 > 声音与振动 > Hi-Fi 页面启用 <br> 3. 设备是否支持 Hi-Fi 功能，请前往 vivo 官网产品页面了解 |
| | joviincar 智能车载 | 🟢 支持 | 1. 2024 年 8 月 29 日 vivo 智能车载 V4.0.7.3 版本添加了对 Salt Player 的支持，感谢向 vivo 反馈的用户和 vivo 的官方支持 <br> 2. 体验版，暂时不支持 joviincar 的歌词显示（不清楚适配方法），可通过车载蓝牙歌词模拟 |
| | 原子随身听 | 🔴 不支持 | 疑似白名单，未找到适配文档 |
| OPPO ColorOS | 流体云 | 🟠 跟进中 | 需要企业资格审核后进行特殊适配开发，请等待 |
| 魅族 Flyme | 状态栏歌词 | 🟢 支持 | |
| | 灵动环 | 🔴 不支持 | 疑似白名单，未找到适配文档 |

## 法律信息

Android 是 Google LLC 的商标

Android 机器人是在 Google 原创及共享成果的基础上再创作或修改而成，须遵照[知识共享](https://creativecommons.org/licenses/by/3.0/)署名 3.0 许可所述条款付诸应用

Salt Player 是寻浔科技（上海）有限公司在中华人民共和国的注册商标

更多相关法律信息请在软件内部以及相关网站查询