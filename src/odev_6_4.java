import java.util.Random;

public class odev_6_4 {
    public static void main(String[] args) {
        Random random = new Random();
        
        // 100 rastgele küçük harften oluşan karakter dizisi oluştur
        char[] karakterDizisi = new char[100];
        System.out.println("100 rastgele küçük harften oluşan dizi:");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < 100; i++) {
            // 'a' (97) ile 'z' (122) arasında rastgele harf üret
            karakterDizisi[i] = (char) (random.nextInt(26) + 'a');
            System.out.print(karakterDizisi[i]);
            // Her 20 karakterde bir satır başı yap (okunabilirlik için)
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n----------------------------------------\n");
        
        // Her harfin kaç kez geçtiğini say
        int[] harfSayilari = new int[26]; // 26 harf için sayaç dizisi
        
        for (int i = 0; i < 100; i++) {
            // Her harfin ASCII değerinden 'a' değerini çıkararak indeks bul (0-25)
            int indeks = karakterDizisi[i] - 'a';
            harfSayilari[indeks]++;
        }
        
        // Sonuçları göster
        System.out.println("Her harfin geçme sayısı:");
        System.out.println("------------------------");
        for (int i = 0; i < 26; i++) {
            char harf = (char) ('a' + i);
            System.out.println(harf + ": " + harfSayilari[i] + " kez");
        }
    }
}

