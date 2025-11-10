import java.util.Arrays;
import java.util.Scanner;

public class odev_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan dizi boyutunu al
        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();
        
        // Diziyi oluştur ve elemanları al
        int[] dizi = new int[n];
        System.out.println("Dizi elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }
        
        // Orijinal diziyi göster
        System.out.println("\nOrijinal dizi: " + Arrays.toString(dizi));
        
        // Diziyi artan sıraya göre sırala (Bubble Sort algoritması)
        int[] siraliDizi = dizi.clone();
        for (int i = 0; i < siraliDizi.length - 1; i++) {
            for (int j = 0; j < siraliDizi.length - i - 1; j++) {
                if (siraliDizi[j] > siraliDizi[j + 1]) {
                    // Elemanları yer değiştir
                    int temp = siraliDizi[j];
                    siraliDizi[j] = siraliDizi[j + 1];
                    siraliDizi[j + 1] = temp;
                }
            }
        }
        
        // Sıralı diziyi göster
        System.out.println("Sıralı dizi (artan): " + Arrays.toString(siraliDizi));
        
        scanner.close();
    }
}
