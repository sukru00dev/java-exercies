import java.util.Scanner;

public class javader2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Basit Dizi İşlemleri ===");
            System.out.print("Dizi boyutunu giriniz: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }
            
            int boyut = scanner.nextInt();
            
            if (boyut <= 0) {
                System.out.println("Dizi boyutu pozitif bir sayı olmalıdır.");
                return;
            }
            
            int[] dizi = new int[boyut];
            System.out.println("Dizi elemanlarını giriniz:");
            
            for (int i = 0; i < boyut; i++) {
                System.out.print((i + 1) + ". eleman: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Geçersiz giriş. Lütfen tam sayı giriniz.");
                    return;
                }
                dizi[i] = scanner.nextInt();
            }
            
            // Dizi elemanlarının toplamını hesapla
            int toplam = 0;
            for (int i = 0; i < boyut; i++) {
                toplam += dizi[i];
            }
            
            // Sonuçları göster
            System.out.println("\nDizi elemanları:");
            for (int i = 0; i < boyut; i++) {
                System.out.print(dizi[i] + " ");
            }
            System.out.println("\nToplam: " + toplam);
            System.out.println("Ortalama: " + (double) toplam / boyut);
        }
    }
}
