import java.util.Locale;
import java.util.Scanner;

public class ders3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Birinci şehri giriniz: ");
            String sehir1 = scanner.nextLine().trim();

            System.out.print("İkinci şehri giriniz: ");
            String sehir2 = scanner.nextLine().trim();

            if (sehir1.isEmpty() || sehir2.isEmpty()) {
                System.out.println("Geçersiz giriş. Boş şehir adı olamaz.");
                return;
            }

            // Türkçe karakter sıralamasında beklenmedik durumları azaltmak için büyük/küçük harfe duyarsız karşılaştırma
            int cmp = sehir1.toLowerCase(Locale.ROOT).compareTo(sehir2.toLowerCase(Locale.ROOT));
            if (cmp <= 0) {
                System.out.println(sehir1 + ", " + sehir2);
            } else {
                System.out.println(sehir2 + ", " + sehir1);
            }
        }
    }
}

