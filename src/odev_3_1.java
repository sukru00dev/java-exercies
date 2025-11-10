import java.util.Scanner;

public class odev_3_1 {
    public static void main(String[] args) {
        final int[] setValues = {1, 2, 4, 8, 16};

        try (Scanner scanner = new Scanner(System.in)) {
            int toplam = 0;

            for (int i = 0; i < setValues.length; i++) {
                int setValue = setValues[i];

                // Küme üyelerini (1..31) bit mantığı ile oluştur
                StringBuilder setIcerik = new StringBuilder();
                for (int gun = 1; gun <= 31; gun++) {
                    if ((gun & setValue) != 0) {
                        if (setIcerik.length() > 0) setIcerik.append(" ");
                        setIcerik.append(gun);
                    }
                }

                System.out.println("Set " + (i + 1) + " (+" + setValue + "):");
                System.out.println(setIcerik);

                // 0/1 doğrulamalı giriş al
                Integer cevap = null;
                while (cevap == null) {
                    System.out.print("Günün bu kümede var mı? (0 = Hayır, 1 = Evet): ");
                    if (!scanner.hasNextInt()) {
                        scanner.next();
                        System.out.println("Geçersiz giriş. Lütfen 0 ya da 1 giriniz.");
                        continue;
                    }
                    int giris = scanner.nextInt();
                    if (giris == 0 || giris == 1) {
                        cevap = giris;
                    } else {
                        System.out.println("Geçersiz giriş. Lütfen 0 ya da 1 giriniz.");
                    }
                }

                if (cevap == 1) {
                    toplam += setValue;
                }
                System.out.println();
            }

            System.out.println("Doğum gününüz: " + toplam);
        }
    }
}

