public class odev_5_1 {
    
    // Test için main metodu
    public static void main(String[] args) {
        System.out.println("=== RandomCharacter Test ===");
        System.out.println("Küçük harfler:");
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.randomLowerCaseLetter() + " ");
        }
        System.out.println("\n\nBüyük harfler:");
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.randomUpperCaseLetter() + " ");
        }
        System.out.println("\n\nRakamlar:");
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.randomDigitCharacter() + " ");
        }
        System.out.println("\n\nTüm karakterler:");
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacter.randomCharacter() + " ");
        }
    }
}

