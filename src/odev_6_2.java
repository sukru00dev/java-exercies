import java.util.Arrays;
import java.util.Scanner;

public class odev_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan dizi boyutunu al
        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();
        
        // Diziyi oluştur ve elemanları al
        int[] dizi = new int[n];
        System.out.println("Dizi elemanlarını giriniz (artan sırada olmalı):");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }
        
        // Diziyi sırala (eğer sıralı değilse)
        Arrays.sort(dizi);
        System.out.println("\nSıralı dizi: " + Arrays.toString(dizi));
        
        // Aranacak değeri al
        System.out.print("\nAranacak değeri giriniz: ");
        int arananDeger = scanner.nextInt();
        
        // Binary Search algoritması ile ara
        int sonuc = binarySearch(dizi, arananDeger);
        
        if (sonuc != -1) {
            System.out.println("Değer bulundu! İndeks: " + sonuc);
        } else {
            System.out.println("Değer bulunamadı!");
        }
        
        scanner.close();
    }
    
    // Binary Search algoritması
    public static int binarySearch(int[] dizi, int hedef) {
        int sol = 0;
        int sag = dizi.length - 1;
        
        while (sol <= sag) {
            int orta = sol + (sag - sol) / 2;
            
            // Ortadaki eleman hedef değere eşitse
            if (dizi[orta] == hedef) {
                return orta;
            }
            
            // Ortadaki eleman hedef değerden küçükse, sağ yarıyı ara
            if (dizi[orta] < hedef) {
                sol = orta + 1;
            }
            // Ortadaki eleman hedef değerden büyükse, sol yarıyı ara
            else {
                sag = orta - 1;
            }
        }
        
        // Değer bulunamadı
        return -1;
    }
}

