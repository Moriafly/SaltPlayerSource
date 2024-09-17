<img src="src/App GitHub Header.png" width="100%"/>

# Salt Player - Pemutar Musik Lokal Pilihan Ratusan Ribu Pengguna

Halaman terjemahan lain: [中文](https://github.com/Moriafly/SaltPlayerSource/blob/main/README.md), [Русский](https://github.com/Moriafly/SaltPlayerSource/tree/main/README-RU.md)

Salt Player adalah aplikasi pemutar musik lokal. Repositori ini digunakan buat ngeluarin versi baru, ngumpulin feedback, dan ngasih pengumuman.

## Cara Download

### Android

Salt Player *untuk Android* butuh Android 6.0 ke atas dan support buat arsitektur arm-v8a dan armeabi-v7a.

| Channel | Keterangan | Rilis |
|:--|:--|:--|
| Moriafly | Paket standar | [Github Release](https://github.com/Moriafly/SaltPlayerSource/releases) <br> [Coolapk](https://www.coolapk.com/apk/284064) (hanya buat arsitektur arm-v8a) |
| Google Play | Paket dari Play Store | [Google Play](https://play.google.com/store/apps/details?id=com.salt.music) (distribusi dinamis) |

Catatan:

1. Pastikan download aplikasi ini dari sumber yang tepat, jangan pakai file instalasi dari sumber yang nggak jelas.
2. Versi Google Play ditandatangani sama Google, jadi nggak bisa dipasang barengan dengan file instalasi dari repositori ini.

### Windows

<img src="src/spw.png" height="128px"/>

Lihat lebih lanjut di [SPW](https://github.com/Moriafly/SPW) untuk petunjuknya.

## Tentang Open Source

Lihat [Salt UI](https://github.com/Moriafly/SaltUI).

## Penyesuaian Bahasa

Lihat lebih lanjut di [Translations](https://github.com/Moriafly/SaltPlayerSource/tree/main/translations).

## Kompatibilitas Sistem

| Sistem | Fitur | Status | Keterangan |
|:--|:--|:--|:--|
| Xiaomi MIUI/Hyper OS | Xiaomi Mi Magic | 🟢 Didukung | 1. Butuh MIUI 12 ke atas buat pakai fitur ini, tinggal klik tombol di kanan atas tampilan pemutar Salt Player <br> 2. Fitur ini pakai komponen sistem dari fitur screencasting Xiaomi, kalau nggak bisa cek dulu komponen-komponennya |
| | Tampilan layar eksternal (seperti Mix Flip) | 🟢 Didukung | |
| | Widget MIUI/Hyper OS | 🟠 Sedang diproses | Tunggu sampai masuk ke store dan selesai review |
| Huawei HarmonyOS | Kontrol Musik Pusat | 🔴 Tidak didukung | Butuh whitelist dan belum ada dokumentasi untuk penyesuaiannya |
| vivo OriginOS/Funtouch OS | joviincar Smart Car Mode | 🟢 Didukung | 1. Pada 29 Agustus 2024, vivo Smart Car V4.0.7.3 sudah support Salt Player. Terima kasih buat feedback pengguna vivo dan dukungan resmi vivo <br> 2. Versi uji coba, belum support tampilan lirik di joviincar (belum tau cara penyesuaiannya), tapi bisa pakai Bluetooth mobil untuk lirik |
| | Hi-Fi | 🔵 Manual | 1. Tambahin lewat adb dengan perintah `settings put global game_support_hifi_list com.salt.music` <br> 2. Setelah masuk ke daftar Hi-Fi, buka Pengaturan > Suara & Getaran > Halaman Hi-Fi buat aktifin <br> 3. Untuk cek perangkat kamu support Hi-Fi atau nggak, cek di website resmi vivo |
| | Atom Walkman | 🔴 Tidak didukung | Kemungkinan butuh whitelist, dokumentasi penyesuaian tidak ditemukan <br> [#749](https://github.com/Moriafly/SaltPlayerSource/issues/749) |
| OPPO ColorOS | Cloud Fluid | 🟠 Sedang diproses | Butuh review kualifikasi perusahaan sebelum penyesuaian khusus bisa dikembangkan, harap ditunggu |
| Meizu Flyme | Lirik di Status Bar | 🟢 Didukung | |
| | Smart Ring | 🔴 Tidak didukung | Kemungkinan butuh whitelist, dokumentasi penyesuaian tidak ditemukan |

## Fitur yang Sudah Tidak Didukung

| Fitur | Waktu Dihentikan | Keterangan |
|:--|:--|:--|
| Audio DSD (.dsf/.dff) | 2024 | Dianggap format usang, disarankan ganti ke FLAC <br> Lihat lebih lanjut di [Salt Player Menghentikan Dukungan untuk Format DSD](https://github.com/Moriafly/SaltPlayerSource/blob/main/articles/240902_Deprecated_DSD.md) |

## Informasi Hukum

Android adalah merek dagang dari Google LLC.

Robot Android diubah atau dikembangkan dari karya yang dibuat dan dibagikan oleh Google, dan penggunaannya mengikuti lisensi [Creative Commons](https://creativecommons.org/licenses/by/3.0/) Atribusi 3.0.

Salt Player adalah merek dagang yang terdaftar atas nama Xunxun Technology (Shanghai) Co., Ltd di Republik Rakyat Tiongkok.

Untuk info hukum lebih lanjut, silakan cek di dalam aplikasi atau situs terkait.
