public class RandomCharacter {
    private static final java.util.Random RAND = new java.util.Random();

    public static char randomLowerCaseLetter() {
        return (char) ('a' + RAND.nextInt(26));
    }

    public static char randomUpperCaseLetter() {
        return (char) ('A' + RAND.nextInt(26));
    }

    public static char randomDigitCharacter() {
        return (char) ('0' + RAND.nextInt(10));
    }

    public static char randomCharacter() {
        return (char) (32 + RAND.nextInt(95));
    }
}
