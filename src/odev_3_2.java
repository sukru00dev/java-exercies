import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class odev_3_2 {
    public static void main(String[] args) {
        int a = ThreadLocalRandom.current().nextInt(0, 10);
        int b = ThreadLocalRandom.current().nextInt(0, 10);

        int buyuk = Math.max(a, b);
        int kucuk = Math.min(a, b);
        int dogruSonuc = buyuk - kucuk;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("0 ve 9 arasında iki sayı üretildi.");
            System.out.print(buyuk + " - " + kucuk + " = ? Cevabınız: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş. Lütfen bir tam sayı giriniz.");
                return;
            }

            int girilen = scanner.nextInt();

            if (girilen == dogruSonuc) {
                System.out.println("Doğru");
            } else {
                System.out.println("Yanlış");
            }

            System.out.println("Üretilen sayılar: " + a + " ve " + b + ", Doğru sonuç: " + dogruSonuc);
        }
    }
}

