import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class dersjava {
    public static void main(String[] args) {
        int sayi1 = ThreadLocalRandom.current().nextInt(0, 10);
        int sayi2 = ThreadLocalRandom.current().nextInt(0, 10);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("0-9 arasında iki sayı üretildi. Bu sayıların toplamını tahmin edin.");
            System.out.print("Toplam nedir? ");

            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }

            int girilenToplam = scanner.nextInt();
            int gercekToplam = sayi1 + sayi2;

            System.out.println("Üretilen sayılar: " + sayi1 + " ve " + sayi2 + ". Toplamları: " + gercekToplam);
            if (girilenToplam == gercekToplam) {
                System.out.println("Doğru");
            } else {
                System.out.println("Yanlış");
            }
        }
    }
}

