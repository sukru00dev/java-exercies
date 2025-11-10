import java.util.Scanner;

public class odev_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan n değerini al
        System.out.print("Kaç adet sayı gireceksiniz? (n): ");
        int n = scanner.nextInt();
        
        // Diziyi oluştur ve sayıları al
        double[] sayilar = new double[n];
        System.out.println("\nSayıları giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayı: ");
            sayilar[i] = scanner.nextDouble();
        }
        
        // Ortalamayı hesapla
        double toplam = 0;
        for (int i = 0; i < n; i++) {
            toplam += sayilar[i];
        }
        double ortalama = toplam / n;
        
        // Ortalamanın üzerindeki sayıları say
        int ortalamaninUzerindekiSayi = 0;
        System.out.println("\nGirilen sayılar:");
        for (int i = 0; i < n; i++) {
            System.out.print(sayilar[i]);
            if (sayilar[i] > ortalama) {
                System.out.print(" (ortalamanın üzerinde)");
                ortalamaninUzerindekiSayi++;
            }
            System.out.println();
        }
        
        // Sonuçları göster
        System.out.println("\nOrtalama: " + ortalama);
        System.out.println("Ortalamanın üzerindeki sayı adedi: " + ortalamaninUzerindekiSayi);
        
        scanner.close();
    }
}

