import java.util.Scanner;

public class odev_5_2 {
    
    /**
     * İki sayıyı karşılaştırıp en büyüğünü döndürür
     * @param sayi1 birinci sayı
     * @param sayi2 ikinci sayı
     * @return iki sayıdan en büyüğü
     */
    public static int max(int sayi1, int sayi2) {
        if (sayi1 > sayi2) {
            return sayi1;
        } else {
            return sayi2;
        }
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== İki Sayının Maksimumunu Bulma ===");
            System.out.print("Birinci sayıyı girin: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }
            int sayi1 = scanner.nextInt();
            
            System.out.print("İkinci sayıyı girin: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }
            int sayi2 = scanner.nextInt();
            
            int enBuyuk = max(sayi1, sayi2);
            
            System.out.println("\nSonuç:");
            System.out.println("Birinci sayı: " + sayi1);
            System.out.println("İkinci sayı: " + sayi2);
            System.out.println("En büyük sayı: " + enBuyuk);
        }
    }
}

