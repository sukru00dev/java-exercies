public class Main {
    private static final int MAX_NUMBER = 20;
    private static final int LIMIT = 100;
    private static final boolean SHOW_STEPS = true;
    private static final boolean USE_COLORS = true;
    private static final String RESET = "\u001B[0m";
    private static final String BOLD = "\u001B[1m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        sumUntilLimit(MAX_NUMBER, LIMIT);
    }

    private static void sumUntilLimit(int maxNumber, int limit) {
        int toplam = 0;
        printBanner(maxNumber, limit);
        for (int i = 1; i <= maxNumber; i++) {
            toplam += i;
            if (SHOW_STEPS) {
                String step = String.format("i=%d, toplam=%d", i, toplam);
                System.out.println(color(step, (toplam > limit) ? RED : GREEN));
            }

            if (toplam > limit) {
                printExceedSummary(i, toplam, limit);
                break;
            }
        }
    }

    private static void printBanner(int maxNumber, int limit) {
        String title = "1'den " + maxNumber + "'ye kadar toplama";
        String subtitle = "Limit: " + limit;
        int width = Math.max(title.length(), subtitle.length()) + 6;
        String border = repeat('=', width);
        System.out.println(border);
        System.out.println(color(center(title, width), CYAN));
        System.out.println(color(center(subtitle, width), GREEN));
        System.out.println(border);
    }

    private static void printExceedSummary(int i, int toplam, int limit) {
        String l1 = "Toplam limit aşıldı";
        String l2 = "i: " + i;
        String l3 = "toplam: " + toplam;
        String l4 = "> " + limit;
        int inner = Math.max(Math.max(l1.length(), l2.length()), Math.max(l3.length(), l4.length()));
        int width = inner + 6;
        String top = "+" + repeat('-', width - 2) + "+";
        System.out.println(top);
        System.out.println("| " + color(pad(l1, width - 4), BOLD + RED) + " |");
        System.out.println("| " + color(pad(l2, width - 4), CYAN) + " |");
        System.out.println("| " + color(pad(l3, width - 4), CYAN) + " |");
        System.out.println("| " + color(pad(l4, width - 4), CYAN) + " |");
        System.out.println(top);
    }

    private static String repeat(char c, int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int k = 0; k < count; k++) sb.append(c);
        return sb.toString();
    }

    private static String pad(String s, int width) {
        if (s.length() >= width) return s;
        StringBuilder sb = new StringBuilder(width);
        sb.append(s);
        while (sb.length() < width) sb.append(' ');
        return sb.toString();
    }

    private static String center(String s, int width) {
        if (s.length() >= width) return s;
        int total = width - s.length();
        int left = total / 2;
        int right = total - left;
        return repeat(' ', left) + s + repeat(' ', right);
    }

    private static String color(String s, String code) {
        if (!USE_COLORS) return s;
        return code + s + RESET;
    }
}