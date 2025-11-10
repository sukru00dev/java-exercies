import java.util.Scanner;

public class odev_5_3 {
    
    /**
     * Bir yılın artık yıl olup olmadığını kontrol eder
     * @param yil kontrol edilecek yıl
     * @return artık yıl ise true, değilse false
     */
    public static boolean artikYil(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
    }
    
    /**
     * Verilen ayın kaç gün olduğunu döndürür
     * @param ay ay numarası (1-12)
     * @param yil yıl (artık yıl kontrolü için)
     * @return ayın gün sayısı
     */
    public static int ayinGunSayisi(int ay, int yil) {
        switch (ay) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return artikYil(yil) ? 29 : 28;
            default:
                return 0;
        }
    }
    
    /**
     * Verilen tarihin haftanın hangi gününe denk geldiğini bulur
     * (Zeller's congruence algoritması - 1 Ocak 1900 = Pazartesi)
     * @param gun gün (1-31)
     * @param ay ay (1-12)
     * @param yil yıl
     * @return haftanın günü (0=Pazar, 1=Pazartesi, ..., 6=Cumartesi)
     */
    public static int haftaninGunu(int gun, int ay, int yil) {
        if (ay < 3) {
            ay += 12;
            yil--;
        }
        int k = yil % 100;
        int j = yil / 100;
        int h = (gun + (13 * (ay + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;
        return ((h + 5) % 7);
    }
    
    /**
     * Ay ismini string olarak döndürür
     * @param ay ay numarası (1-12)
     * @return ay ismi
     */
    public static String ayIsmi(int ay) {
        String[] aylar = {
            "", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
            "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"
        };
        return aylar[ay];
    }
    
    /**
     * Takvimi ekrana yazdırır
     * @param ay ay numarası (1-12)
     * @param yil yıl
     */
    public static void takvimiYazdir(int ay, int yil) {
        int gunSayisi = ayinGunSayisi(ay, yil);
        int ilkGun = haftaninGunu(1, ay, yil); // Ayın 1'i hangi güne denk geliyor
        
        System.out.println("\n" + ayIsmi(ay) + " " + yil);
        System.out.println("================================");
        System.out.println("Pzt Sal Çar Per Cum Cmt Paz");
        System.out.println("-------------------------------");
        
        // İlk gün için boşlukları yazdır
        for (int i = 0; i < ilkGun; i++) {
            System.out.print("    ");
        }
        
        // Günleri yazdır
        for (int gun = 1; gun <= gunSayisi; gun++) {
            System.out.printf("%3d ", gun);
            
            // Cumartesi'den sonra (yani Pazar) yeni satıra geç
            if ((gun + ilkGun) % 7 == 0) {
                System.out.println();
            }
        }
        
        // Son satırda kalan boşlukları düzelt
        if ((gunSayisi + ilkGun) % 7 != 0) {
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Takvim Programı ===");
            
            System.out.print("Yıl girin: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }
            int yil = scanner.nextInt();
            
            System.out.print("Ay girin (1-12): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }
            int ay = scanner.nextInt();
            
            // Ay geçerliliğini kontrol et
            if (ay < 1 || ay > 12) {
                System.out.println("Geçersiz ay! Lütfen 1-12 arası bir sayı girin.");
                return;
            }
            
            // Takvimi yazdır
            takvimiYazdir(ay, yil);
        }
    }
}
