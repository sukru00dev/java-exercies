# WakaTime GitHub Entegrasyonu Kurulum Rehberi

Bu rehber, WakaTime API key'inizi GitHub repository'nize entegre etmek için adım adım talimatlar içerir.

## 🔑 GitHub Secrets'a API Key Ekleme

1. GitHub repository'nize gidin: https://github.com/sukru00dev/java-exercies

2. **Settings** sekmesine tıklayın (repository'nin üst menüsünde)

3. Sol menüden **Secrets and variables** > **Actions** seçeneğine tıklayın

4. **New repository secret** butonuna tıklayın

5. Şu bilgileri girin:
   - **Name**: `WAKATIME_API_KEY`
   - **Secret**: `10c1eaf7-b3ad-4b3f-90e3-a283ce0f9efb`

6. **Add secret** butonuna tıklayın

## ✅ Kurulum Tamamlandı!

API key eklendikten sonra:

- GitHub Actions otomatik olarak her gün çalışacak ve WakaTime istatistiklerinizi README.md dosyasına ekleyecek
- İlk çalıştırmayı manuel olarak tetiklemek için:
  1. **Actions** sekmesine gidin
  2. **WakaTime Stats** workflow'unu seçin
  3. **Run workflow** butonuna tıklayın

## 📊 İstatistiklerin Görünümü

WakaTime istatistikleri README.md dosyasının "Kod İstatistikleri" bölümünde otomatik olarak görünecektir. İstatistikler şunları içerir:

- Toplam kod yazma süresi
- Günlük ortalama
- Kullanılan diller
- İşletim sistemi
- Editörler
- Projeler
- Satır sayısı
- Commit istatistikleri

## 🔄 Otomatik Güncelleme

Workflow her gün saat 00:00 UTC'de (Türkiye saati ile 03:00) otomatik olarak çalışır ve istatistikleri günceller.

## 🛠️ Sorun Giderme

Eğer istatistikler görünmüyorsa:

1. GitHub Secrets'da API key'in doğru eklendiğinden emin olun
2. Actions sekmesinde workflow'un başarıyla çalıştığını kontrol edin
3. README.md dosyasında `<!--START_SECTION:waka-->` ve `<!--END_SECTION:waka-->` etiketlerinin olduğundan emin olun

