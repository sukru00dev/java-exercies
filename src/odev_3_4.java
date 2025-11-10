public class odev_3_4 {
    public static void main(String[] args) {
        double[] acilar = {30.0, 60.0};

        for (double derece : acilar) {
            double radyan = Math.toRadians(derece);
            double sin = Math.sin(radyan);
            double cos = Math.cos(radyan);
            double tan = Math.tan(radyan);

            System.out.println("Açı: " + derece + "°");
            System.out.println("Radyan: " + radyan);
            System.out.println("sin: " + sin);
            System.out.println("cos: " + cos);
            System.out.println("tan: " + tan);
            System.out.println();
        }
    }
}

