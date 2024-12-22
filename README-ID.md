<img src="src/App GitHub Header.png" width="100%"/>

# Salt Player - Pemutar Musik Lokal Pilihan Ratusan Ribu Pengguna

Select Language: [中文](https://github.com/Moriafly/SaltPlayerSource/blob/main/README.md), [Русский](https://github.com/Moriafly/SaltPlayerSource/tree/main/README-RU.md)

Salt Player adalah aplikasi pemutar musik lokal. Repositori ini dipakai buat ngeluarin versi baru, ngumpulin feedback, dan ngasih pengumuman

## Cara Download

### Android

Salt Player *untuk Android* butuh Android 6.0 ke atas dan support buat arsitektur arm-v8a dan armeabi-v7a

| Channel | Rilis | Keterangan | ⚠️ Catatan |
|:--|:--|:--|:--|
| Moriafly | 1. [Github Release](https://github.com/Moriafly/SaltPlayerSource/releases) <br> 2. [Coolapk](https://www.coolapk.com/apk/284064) | Paket standar | Rilis di Coolapk cuma support arm64-v8a |
| Google Play | [Google Play](https://play.google.com/store/apps/details?id=com.salt.music) | Paket dari Play Store | 1. Google Play nyesuaiin arsitektur arm64-v8a/armeabi-v7a <br> 2. Versi Google Play ditandatangani sama Google, jadi gak kompatibel sama paket standar di repositori ini <br> 3. Versi di Play Store kadang versi stabil khusus, update bisa beda sama paket standar |

Catatan: Pastikan download aplikasi ini dari sumber yang bener, jangan pakai file instalasi dari sumber yang gak jelas

#### Aturan Penamaan Versi (File)

Misalnya nama file Apk 10.5.0.2-release-2024091902-moriafly-arm64-v8a, artinya:

| Teks | Arti | Keterangan |
|:--|:--|:--|
| 10.5.0.2 | Nama versi | 10 buat versi mayor, 5 buat versi minor, 0 buat revisi, 2 buat patch emergency (kalau 0 biasanya gak ditulis, kayak langsung versi 10.4.4) |
| release | Tipe versi | 1. release buat versi stabil, beta buat versi uji coba publik, alpha buat versi internal <br> 2. Tipe release biasanya gak ditulis, tapi alpha kadang dirilis publik meski stabilitasnya rendah <br> 3. Stabilitas: release > beta > alpha (ini subjektif sih) |
| 2024091902 | Kode versi | Kode versi Salt Player *untuk Android*, 2024091902 artinya build kedua di tanggal 19 September 2024 |
| moriafly | Kode channel | Lihat di tabel channel |
| arm64-v8a | Arsitektur | Lihat di tabel channel |

### Windows

<img src="src/spw.png" height="128px"/>

Lihat lebih lanjut di [SPW](https://github.com/Moriafly/SPW) untuk panduannya

## Tentang Open Source

Lihat [Salt UI](https://github.com/Moriafly/SaltUI)

## Penyesuaian Bahasa

Lihat lebih lanjut di [Translations](https://github.com/Moriafly/SaltPlayerSource/tree/main/translations)

## Kompatibilitas Sistem

| Sistem | Fitur | Status | Keterangan |
|:--|:--|:--|:--|
| Xiaomi MIUI/Hyper OS | Xiaomi Mi Magic | 🟢 Didukung | 1. Fitur ini butuh MIUI 12 ke atas, tinggal klik tombol di kanan atas tampilan Salt Player <br> 2. Pakai komponen sistem dari screencast Xiaomi, kalau gak bisa cek komponen terkaitnya |
| | Tampilan layar eksternal (kayak Mix Flip) | 🟢 Didukung | |
| | Widget MIUI/Hyper OS | 🟠 Sedang diproses | Tunggu sampai masuk ke store dan selesai review |
| Huawei HarmonyOS | Kontrol Musik Pusat | 🔴 Tidak didukung | Butuh whitelist dan belum ada dokumentasi penyesuaian |
| vivo OriginOS/Funtouch OS | joviincar Smart Car Mode | 🟢 Didukung | 1. Pada 29 Agustus 2024, vivo Smart Car V4.0.7.3 udah support Salt Player. Terima kasih buat feedback pengguna vivo dan dukungan resmi vivo <br> 2. Versi uji coba, belum support tampilan lirik di joviincar, bisa pakai Bluetooth mobil buat lirik |
| | Hi-Fi | 🔵 Manual | 1. Tambahin lewat adb dengan perintah `settings put global game_support_hifi_list com.salt.music` <br> 2. Setelah masuk daftar Hi-Fi, buka Pengaturan > Suara & Getaran > Halaman Hi-Fi buat aktifin <br> 3. Untuk cek perangkat kamu support Hi-Fi atau gak, cek di website resmi vivo |
| | Atom Walkman | 🔴 Tidak didukung | Kemungkinan butuh whitelist, dokumentasi penyesuaian gak ditemukan <br> [#749](https://github.com/Moriafly/SaltPlayerSource/issues/749) |
| OPPO ColorOS | Fluid Cloud | 🟠 Sedang diproses | Butuh review kualifikasi perusahaan sebelum penyesuaian khusus bisa dikembangkan, harap ditunggu |
| Meizu Flyme | Lirik di Status Bar | 🟢 Didukung | |
| | Smart Ring | 🔴 Tidak didukung | Kemungkinan butuh whitelist, dokumentasi penyesuaian gak ditemukan |

## Fitur yang Sudah Tidak Didukung

| Fitur | Waktu Dihentikan | Keterangan |
|:--|:--|:--|
| Audio DSD (.dsf/.dff) | 2024 | Dianggap format lama, disarankan ganti ke FLAC <br> Lihat lebih lanjut di [Salt Player Menghentikan Dukungan untuk Format DSD](https://github.com/Moriafly/SaltPlayerSource/blob/main/articles/240902_Deprecated_DSD.md) |

## Kontributor repositori ini

<a href="https://github.com/Moriafly/SaltPlayerSource/graphs/contributors">
    <img src="https://contrib.rocks/image?repo=Moriafly/SaltPlayerSource&columns=12" />
</a>

## Informasi Hukum

Android adalah merek dagang dari Google LLC

Robot Android adalah karya turunan yang dibuat dan dibagikan oleh Google, dan penggunaannya mengikuti lisensi [Creative Commons](https://creativecommons.org/licenses/by/3.0/) Atribusi 3.0

Salt Player adalah merek dagang yang terdaftar atas nama Xunxun Technology (Shanghai) Co., Ltd di Republik Rakyat Tiongkok

Untuk info hukum lebih lanjut, silakan cek di dalam aplikasi atau situs terkait
