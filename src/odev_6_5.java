import java.util.Random;

public class odev_6_5 {
    public static void main(String[] args) {
        Random random = new Random();
        
        // 10 gün × 24 saatlik sıcaklık ve nem verilerini sakla
        double[][] sicaklik = new double[10][24];
        double[][] nem = new double[10][24];
        
        // Rastgele veriler oluştur (gerçek uygulamada kullanıcıdan veya sensörden alınır)
        // Sıcaklık: 15-35 derece arası
        // Nem: 30-80% arası
        for (int gun = 0; gun < 10; gun++) {
            for (int saat = 0; saat < 24; saat++) {
                sicaklik[gun][saat] = 15 + random.nextDouble() * 20; // 15-35 arası
                nem[gun][saat] = 30 + random.nextDouble() * 50; // 30-80 arası
            }
        }
        
        // Her günün ortalama sıcaklık ve nemini hesapla ve göster
        System.out.println("Günlük Ortalama Sıcaklık ve Nem Raporu");
        System.out.println("========================================");
        System.out.printf("%-5s %-20s %-20s\n", "Gün", "Ortalama Sıcaklık (°C)", "Ortalama Nem (%)");
        System.out.println("----------------------------------------");
        
        for (int gun = 0; gun < 10; gun++) {
            double sicaklikToplam = 0;
            double nemToplam = 0;
            
            // 24 saatin toplamını hesapla
            for (int saat = 0; saat < 24; saat++) {
                sicaklikToplam += sicaklik[gun][saat];
                nemToplam += nem[gun][saat];
            }
            
            // Ortalamaları hesapla
            double ortalamaSicaklik = sicaklikToplam / 24;
            double ortalamaNem = nemToplam / 24;
            
            // Sonuçları göster
            System.out.printf("%-5d %-20.2f %-20.2f\n", (gun + 1), ortalamaSicaklik, ortalamaNem);
        }
        
        System.out.println("\n========================================");
        
        // İsteğe bağlı: Detaylı günlük verileri göster
        System.out.println("\nDetaylı Günlük Veriler (İlk 3 gün, ilk 5 saat):");
        System.out.println("================================================");
        for (int gun = 0; gun < 3; gun++) {
            System.out.println("\nGün " + (gun + 1) + ":");
            System.out.printf("%-8s %-15s %-15s\n", "Saat", "Sıcaklık (°C)", "Nem (%)");
            System.out.println("----------------------------------------");
            for (int saat = 0; saat < 5; saat++) {
                System.out.printf("%-8d %-15.2f %-15.2f\n", saat, sicaklik[gun][saat], nem[gun][saat]);
            }
        }
    }
}

