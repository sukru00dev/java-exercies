import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ders2 {
    public static void main(String[] args) {
        int hedef = ThreadLocalRandom.current().nextInt(10, 100);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("İki basamaklı bir sayı tahmin edin (10-99): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen 10-99 arasında bir tam sayı giriniz.");
                return;
            }

            int tahmin = scanner.nextInt();
            if (tahmin < 10 || tahmin > 99) {
                System.out.println("Geçersiz aralık. Lütfen 10 ile 99 arasında bir sayı giriniz.");
                return;
            }

            int hedefOnlar = hedef / 10;
            int hedefBirler = hedef % 10;
            int tahminOnlar = tahmin / 10;
            int tahminBirler = tahmin % 10;

            if (tahmin == hedef) {
                System.out.println("Tebrikler! 10000 dolar kazandınız.");
            } else if (tahminOnlar == hedefBirler && tahminBirler == hedefOnlar) {
                System.out.println("Tebrikler! 3000 dolar kazandınız.");
            } else if (tahminOnlar == hedefOnlar || tahminOnlar == hedefBirler || tahminBirler == hedefOnlar || tahminBirler == hedefBirler) {
                System.out.println("Tebrikler! 1000 dolar kazandınız.");
            } else {
                System.out.println("Eşleşmedi.");
            }

            System.out.println("Doğru sayı: " + hedef);
        }
    }
}

