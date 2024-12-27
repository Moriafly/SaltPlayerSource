<img src="src/App GitHub Header.png" width="100%"/>

# Salt Player 数十万用户选择的本地音乐播放器

Select Language: [Русский](https://github.com/Moriafly/SaltPlayerSource/tree/main/README-RU.md)，[Indonesia](https://github.com/Moriafly/SaltPlayerSource/tree/main/README-ID.md)

Salt Player（椒盐音乐）是一款本地音乐播放软件，本仓库用来发布新版本、收集反馈和发布通知

## 下载渠道

### Android

Salt Player *for Android* 需要 Android 6.0 及以上系统，支持 arm-v8a 以及 armeabi-v7a 架构

| 渠道 | 发布 | 介绍 | ⚠️ 注意 |
|:--|:--|:--|:--|
| Moriafly | 1. [Github Release](https://github.com/Moriafly/SaltPlayerSource/releases) <br> 2. [酷安](https://www.coolapk.com/apk/284064) | 标准包 | 酷安发布仅提供 arm64-v8a 架构 |
| Google Play | [Google Play](https://play.google.com/store/apps/details?id=com.salt.music) | 谷歌 Play 商店渠道包 | 1. 动态下发 arm64-v8a/armeabi-v7a 架构 <br> 2. Google Play 版本由谷歌签名发布，与此标准包**不兼容** <br> 3. 会选用特殊的稳定版本或特殊制作版本，与标准包更新策略不同 |
| Official | 1. OPPO 软件商店 <br> 2. [荣耀应用市场](https://appmarket-h5.cloud.honor.com/h5/share/latest/index.html?shareId=1842107500028387328&shareTo=copyLink) <br> 3. [小米应用商店](http://app.xiaomi.com/detail/1610743) <br> 4. [华为应用市场](https://url.cloud.huawei.com/sztUvRf1XW) <br> *以上序号按上架先后顺序排序，暂未找到 OPPO 软件商店 Salt Player 的分享链接* | 中国大陆商店渠道包 | 1. 仅提供 arm64-v8a 架构 <br> 2. 仅面向中国大陆提供支持 <br> 3. 会选用特殊的稳定版本或特殊制作版本，与标准包更新策略不同 <br> 4. 受审核或其他原因，不同应用商店更新速度或版本号可能存在差异 |

注意：请在正确的渠道下载本应用，请勿使用未知签名来源的安装文件

#### 版本（文件）命名规则

例如 Apk 文件名 10.5.0.2-release-2024091902-moriafly-arm64-v8a，含义为：

| 文本 | 代表 | 介绍 |
|:--|:--|:--|
| 10.5.0.2 | 版本名称 | 10 表示大版本，5 表示次要版本，0 表示小版本，2 表示紧急修复次数（通常记录为 0 而省略，如直接填写 10.4.4 版本） |
| release | 版本类型 | 1. release 代表稳定版本，beta 代表公开测试版本，alpha 代表内部测试版本 <br> 2. release 类型一般省略不写，alpha 版本也可能公开发布但表示稳定性较低 <br> 3. 稳定性 release > beta > alpha（存在主观判断） |
| 2024091902 | 版本代码 | Salt Player *for Android* 的版本代码具有含义，2024091902 表示此版本是 2024 年 9 月 19 日第 2 次构建的 |
| moriafly | 渠道编号 | 见渠道表 |
| arm64-v8a | 架构 | 见渠道表 |


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
| | CarWith | 🟢 支持 | 2024 年 12 月 26 日 CarWith 3.3.6 版本支持，感谢小米官方支持 |
| | 外屏显示（如 Mix Flip） | 🟢 支持 | |
| | MIUI/Hyper OS 小部件 | 🟠 跟进中 | 等待开发 |
| 华为鸿蒙 | 音乐控制中心 | 🔴 不支持 | 白名单控制以及未发现适配文档，联系沟通无果 |
| vivo OriginOS/Funtouch OS  | joviincar 智能车载 | 🟢 支持 | 1. 2024 年 8 月 29 日 vivo 智能车载 V4.0.7.3 版本添加了对 Salt Player 的支持，感谢向 vivo 反馈的用户和 vivo 的官方支持 <br> 2. 体验版，暂时不支持 joviincar 的歌词显示（不清楚适配方法），可通过车载蓝牙歌词模拟 |
| | Hi-Fi | 🔵 手动 | 1. 通过 adb 的方式输入 `settings put global game_support_hifi_list com.salt.music` 添加 <br> 2. 添加 Salt Player 进入 Hi-Fi 列表后，进入系统设置 > 声音与振动 > Hi-Fi 页面启用 <br> 3. 设备是否支持 Hi-Fi 功能，请前往 vivo 官网产品页面了解 |
| | 原子随身听 | 🔴 不支持 | 疑似白名单，未找到适配文档 <br> [#749](https://github.com/Moriafly/SaltPlayerSource/issues/749) |
| OPPO ColorOS | 流体云 | 🟢 支持 | 2024 年 11 月 4 日起逐步灰度测试，感谢 OPPO 官方支持 |
| 魅族 Flyme | 状态栏歌词 | 🟢 支持 | |
| | 灵动环 | 🔴 不支持 | 疑似白名单，未找到适配文档 |

## 不再维护或支持的功能

| 功能 | 废弃时间 | 说明 |
|:--|:--|:--|
| DSD 音频（.dsf/.dff）| 2024 年 | 视为过时格式，推荐更换为 FLAC <br> 详见 [Salt Player 终止对 DSD 格式的维护和支持](https://github.com/Moriafly/SaltPlayerSource/blob/main/articles/240902_Deprecated_DSD.md) |

## 本仓库贡献者

<a href="https://github.com/Moriafly/SaltPlayerSource/graphs/contributors">
    <img src="https://contrib.rocks/image?repo=Moriafly/SaltPlayerSource&columns=12" />
</a>

## 法律信息

**Android** 是 Google LLC 的商标

**Android 机器人**是在 Google 原创及共享成果的基础上再创作或修改而成，须遵照[知识共享](https://creativecommons.org/licenses/by/3.0/)署名 3.0 许可所述条款付诸应用

**Salt Player** 和**糖醋音乐**均是寻浔科技（上海）有限公司在中华人民共和国的注册商标

更多相关法律信息请在软件内部以及相关网站查询