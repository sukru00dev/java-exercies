import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class odev_3_3 {
    public static void main(String[] args) {
        // 10-99 arası sayı üret ve String'e çevir
        int sayi = ThreadLocalRandom.current().nextInt(10, 100);
        String hedef = Integer.toString(sayi);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("2 basamaklı bir tahmin giriniz (10-99): ");
            String tahmin = scanner.nextLine().trim();

            // Girdi doğrulama: tam 2 haneli ve sayısal olmalı
            if (tahmin.length() != 2 || !tahmin.chars().allMatch(Character::isDigit) || tahmin.charAt(0) == '0') {
                System.out.println("Geçersiz giriş. Lütfen 10-99 aralığında iki basamaklı bir sayı giriniz.");
                return;
            }

            // Eşleşme kuralları
            if (tahmin.equals(hedef)) {
                System.out.println("10000");
            } else if (tahmin.charAt(0) == hedef.charAt(1) && tahmin.charAt(1) == hedef.charAt(0)) {
                System.out.println("3000");
            } else if (tahmin.charAt(0) == hedef.charAt(0) || tahmin.charAt(0) == hedef.charAt(1)
                    || tahmin.charAt(1) == hedef.charAt(0) || tahmin.charAt(1) == hedef.charAt(1)) {
                System.out.println("1000");
            } else {
                System.out.println("Eşleşmedi");
            }

            System.out.println("Doğru sayı: " + hedef);
        }
    }
}

