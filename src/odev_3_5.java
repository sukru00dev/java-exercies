import java.util.Scanner;

public class odev_3_5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir hekzadesimal rakam giriniz (0-9, A-F, a-f): ");
            String input = scanner.nextLine().trim();

            if (input.length() != 1) {
                System.out.println("Geçersiz giriş. Lütfen tek bir karakter giriniz.");
                return;
            }

            char ch = input.charAt(0);
            int deger = Character.digit(ch, 16);

            if (deger == -1) {
                System.out.println("Geçersiz karakter. Sadece 0-9, A-F veya a-f giriniz.");
                return;
            }

            System.out.println("Ondalık karşılığı: " + deger);
        }
    }
}

