public class java1 {
    public static void main(String[] args) {
        int total = 50;
        int perRow = 10;
        int count = 0;
        int num = 2;

        while (count < total) {
            if (isPrime(num)) {
                System.out.printf("%-6d", num);
                count++;
                if (count % perRow == 0) System.out.println();
            }
            num++;
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int r = (int) Math.sqrt(n);
        for (int i = 3; i <= r; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
