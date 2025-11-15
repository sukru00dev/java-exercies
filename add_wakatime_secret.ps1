# WakaTime API Key'i GitHub Secrets'a ekleme scripti
# Bu script GitHub API kullanarak secret ekler

$repoOwner = "sukru00dev"
$repoName = "java-exercies"
$secretName = "WAKATIME_API_KEY"
$secretValue = "10c1eaf7-b3ad-4b3f-90e3-a283ce0f9efb"

Write-Host "GitHub Secrets'a WakaTime API Key ekleniyor..." -ForegroundColor Cyan
Write-Host ""

# GitHub Personal Access Token iste
$token = Read-Host "GitHub Personal Access Token giriniz (repo ve workflow izinleri olmalı)"

if ([string]::IsNullOrWhiteSpace($token)) {
    Write-Host "Token girilmedi. İşlem iptal edildi." -ForegroundColor Red
    exit 1
}

# GitHub Public Key al
Write-Host "GitHub public key alınıyor..." -ForegroundColor Yellow
$publicKeyUrl = "https://api.github.com/repos/$repoOwner/$repoName/actions/secrets/public-key"
$headers = @{
    "Authorization" = "Bearer $token"
    "Accept" = "application/vnd.github.v3+json"
}

try {
    $publicKeyResponse = Invoke-RestMethod -Uri $publicKeyUrl -Method Get -Headers $headers
    $publicKey = $publicKeyResponse.key
    $keyId = $publicKeyResponse.key_id
    
    Write-Host "Public key alındı: $keyId" -ForegroundColor Green
    
    # Secret'ı şifrele (libsodium kullanarak)
    # PowerShell'de libsodium yok, bu yüzden GitHub CLI veya web arayüzü kullanılmalı
    Write-Host ""
    Write-Host "UYARI: PowerShell'de secret şifreleme için libsodium gerekir." -ForegroundColor Yellow
    Write-Host "Alternatif yöntemler:" -ForegroundColor Yellow
    Write-Host ""
    Write-Host "1. GitHub Web Arayüzü (Önerilen):" -ForegroundColor Cyan
    Write-Host "   - https://github.com/$repoOwner/$repoName/settings/secrets/actions" -ForegroundColor White
    Write-Host "   - 'New repository secret' butonuna tıklayın" -ForegroundColor White
    Write-Host "   - Name: $secretName" -ForegroundColor White
    Write-Host "   - Secret: $secretValue" -ForegroundColor White
    Write-Host ""
    Write-Host "2. GitHub CLI kullanarak:" -ForegroundColor Cyan
    Write-Host "   gh secret set $secretName --repo $repoOwner/$repoName --body `"$secretValue`"" -ForegroundColor White
    Write-Host ""
    
} catch {
    Write-Host "Hata: $($_.Exception.Message)" -ForegroundColor Red
    if ($_.Exception.Response.StatusCode -eq 401) {
        Write-Host "Token geçersiz veya yetersiz izinlere sahip." -ForegroundColor Red
    }
    exit 1
}

