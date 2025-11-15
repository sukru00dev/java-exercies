# GitHub Secrets'a WakaTime API Key Ekleme

WakaTime API key'inizi GitHub Secrets'a eklemek için aşağıdaki yöntemlerden birini kullanabilirsiniz:

## 🚀 Yöntem 1: GitHub Web Arayüzü (En Kolay - Önerilen)

1. **GitHub repository'nize gidin:**
   - https://github.com/sukru00dev/java-exercies

2. **Settings sekmesine tıklayın** (repository'nin üst menüsünde)

3. **Sol menüden şu yolu izleyin:**
   - `Secrets and variables` > `Actions`

4. **"New repository secret" butonuna tıklayın**

5. **Şu bilgileri girin:**
   - **Name**: `WAKATIME_API_KEY`
   - **Secret**: `10c1eaf7-b3ad-4b3f-90e3-a283ce0f9efb`

6. **"Add secret" butonuna tıklayın**

✅ **Tamamlandı!** Artık GitHub Actions workflow'unuz çalışabilir.

---

## 🔧 Yöntem 2: GitHub CLI Kullanarak

Eğer GitHub CLI kuruluysa:

```bash
gh secret set WAKATIME_API_KEY --repo sukru00dev/java-exercies --body "10c1eaf7-b3ad-4b3f-90e3-a283ce0f9efb"
```

GitHub CLI kurulu değilse:
- Windows: `winget install --id GitHub.cli`
- Veya: https://cli.github.com/

---

## 📋 Yöntem 3: PowerShell Script (Gelişmiş)

`add_wakatime_secret.ps1` scriptini çalıştırabilirsiniz, ancak GitHub Personal Access Token gerektirir.

---

## ✅ Kontrol Etme

Secret eklendikten sonra:

1. **Actions sekmesine gidin**
2. **"WakaTime Stats" workflow'unu seçin**
3. **"Run workflow" butonuna tıklayın** (sağ üstte)
4. Workflow başarıyla çalıştığında README.md'de WakaTime istatistikleri görünecek

---

## 🔗 Hızlı Link

Doğrudan Secrets sayfasına gitmek için:
👉 https://github.com/sukru00dev/java-exercies/settings/secrets/actions

