import java.util.Locale;
import java.util.Scanner;

public class odev_3_6 {
    public static void main(String[] args) {
        // Türkçe ondalık ayırıcı sorunlarını azaltmak için nokta kullanımı
        Locale.setDefault(Locale.ROOT);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("x1 y1 değerlerini giriniz: ");
            if (!scanner.hasNextDouble()) { System.out.println("Geçersiz giriş."); return; }
            double x1 = scanner.nextDouble();
            if (!scanner.hasNextDouble()) { System.out.println("Geçersiz giriş."); return; }
            double y1 = scanner.nextDouble();

            System.out.print("x2 y2 değerlerini giriniz: ");
            if (!scanner.hasNextDouble()) { System.out.println("Geçersiz giriş."); return; }
            double x2 = scanner.nextDouble();
            if (!scanner.hasNextDouble()) { System.out.println("Geçersiz giriş."); return; }
            double y2 = scanner.nextDouble();

            System.out.print("x3 y3 değerlerini giriniz: ");
            if (!scanner.hasNextDouble()) { System.out.println("Geçersiz giriş."); return; }
            double x3 = scanner.nextDouble();
            if (!scanner.hasNextDouble()) { System.out.println("Geçersiz giriş."); return; }
            double y3 = scanner.nextDouble();

            double a = distance(x2, y2, x3, y3); // karşısı A açısı
            double b = distance(x1, y1, x3, y3); // karşısı B açısı
            double c = distance(x1, y1, x2, y2); // karşısı C açısı

            if (!isValidTriangle(a, b, c)) {
                System.out.println("Geçersiz üçgen (noktalar aynı doğrultuda veya çakışıyor).");
                return;
            }

            double A = angleFromSides(b, c, a);
            double B = angleFromSides(a, c, b);
            double C = angleFromSides(a, b, c);

            System.out.printf(Locale.ROOT, "A açısı (x1,y1): %.4f°%n", A);
            System.out.printf(Locale.ROOT, "B açısı (x2,y2): %.4f°%n", B);
            System.out.printf(Locale.ROOT, "C açısı (x3,y3): %.4f°%n", C);
            System.out.printf(Locale.ROOT, "Toplam: %.4f°%n", (A + B + C));
        }
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.hypot(dx, dy);
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        double eps = 1e-9;
        if (a < eps || b < eps || c < eps) return false;
        return a + b > c + eps && a + c > b + eps && b + c > a + eps;
    }

    // Kosinüs teoremi: cos(α) = (b^2 + c^2 - a^2) / (2bc)
    private static double angleFromSides(double b, double c, double a) {
        double cos = (b*b + c*c - a*a) / (2.0 * b * c);
        // Sayısal hatalar için aralığı sıkıştır
        if (cos > 1.0) cos = 1.0;
        if (cos < -1.0) cos = -1.0;
        return Math.toDegrees(Math.acos(cos));
    }
}

