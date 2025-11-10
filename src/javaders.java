import java.util.Scanner;

public class javaders {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[][] dizi = new int[3][4];
			int toplam = 0;
			System.out.println("3x4 boyutunda bir dizi için 12 sayı giriniz:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					if (scanner.hasNextInt()) {
						toplam += (dizi[i][j] = scanner.nextInt());
					} else {
						System.out.println("Geçersiz giriş. Lütfen tam sayı giriniz.");
						return;
					}
				}
			}
			System.out.println("Toplam: " + toplam);
		}
	}
}
