import java.util.Scanner;

public class odev_5_5 {
    
    public static int hexKarakterDeger(char karakter) {
        if (karakter >= '0' && karakter <= '9') {
            return karakter - '0';
        } else if (karakter >= 'A' && karakter <= 'F') {
            return karakter - 'A' + 10;
        } else if (karakter >= 'a' && karakter <= 'f') {
            return karakter - 'a' + 10;
        }
        return -1;
    }
    
    public static boolean gecerliHex(String hex) {
        if (hex == null || hex.isEmpty()) {
            return false;
        }
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (!((c >= '0' && c <= '9') || 
                  (c >= 'A' && c <= 'F') || 
                  (c >= 'a' && c <= 'f'))) {
                return false;
            }
        }
        return true;
    }
    
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int us = 0;
        
        for (int i = hex.length() - 1; i >= 0; i--) {
            char karakter = hex.charAt(i);
            int deger = hexKarakterDeger(karakter);
            
            if (deger == -1) {
                return -1;
            }
            
            decimal += deger * Math.pow(16, us);
            us++;
        }
        
        return decimal;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Hexadecimal sayı girin: ");
            String hex = scanner.nextLine().trim();
            
            if (!gecerliHex(hex)) {
                System.out.println("Geçersiz hexadecimal sayı!");
                return;
            }
            
            int decimal = hexToDecimal(hex);
            
            System.out.println("Hexadecimal: " + hex.toUpperCase());
            System.out.println("Decimal: " + decimal);
        }
    }
}

