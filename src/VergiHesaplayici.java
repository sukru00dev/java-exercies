import java.util.Scanner;

public class VergiHesaplayici {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Kullanıcıya seçenekleri göster
            System.out.println("(0 - Bekar, 1 - Evli birlikte beyan, 2 - Evli ayrı beyan, 3 - Hane reisi)");
            System.out.print("Vergi durumunuzu giriniz (0-3): ");
            
            if (!input.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }
            int durum = input.nextInt();

            System.out.print("Vergilendirilebilir gelirinizi giriniz: ");
            if (!input.hasNextDouble()) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                return;
            }
            double gelir = input.nextDouble();

        double vergi = 0;

        // Basit örnek oranlarla vergi hesaplama
        if (durum == 0) { // Bekar
            if (gelir <= 8350)
                vergi = gelir * 0.10;
            else if (gelir <= 33950)
                vergi = 8350 * 0.10 + (gelir - 8350) * 0.15;
            else
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 + (gelir - 33950) * 0.25;
        }
        else if (durum == 1) { // Evli birlikte beyan
            if (gelir <= 16700)
                vergi = gelir * 0.10;
            else if (gelir <= 67900)
                vergi = 16700 * 0.10 + (gelir - 16700) * 0.15;
            else
                vergi = 16700 * 0.10 + (67900 - 16700) * 0.15 + (gelir - 67900) * 0.25;
        }
        else if (durum == 2) { // Evli ayrı beyan
            if (gelir <= 8350)
                vergi = gelir * 0.10;
            else if (gelir <= 33950)
                vergi = 8350 * 0.10 + (gelir - 8350) * 0.15;
            else
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 + (gelir - 33950) * 0.25;
        }
        else if (durum == 3) { // Hane reisi
            if (gelir <= 11950)
                vergi = gelir * 0.10;
            else if (gelir <= 45500)
                vergi = 11950 * 0.10 + (gelir - 11950) * 0.15;
            else
                vergi = 11950 * 0.10 + (45500 - 11950) * 0.15 + (gelir - 45500) * 0.25;
        }
        else {
            System.out.println("Hatalı vergi durumu girdiniz! Lütfen 0 ile 3 arasında bir değer giriniz.");
            return;
        }

            // Sonucu 2 ondalık basamakla göster
            System.out.printf("Ödemeniz gereken vergi: %.2f USD%n", vergi);
        }
    }
}
