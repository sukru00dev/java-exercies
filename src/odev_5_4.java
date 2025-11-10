public class odev_5_4 {
    
    public static void increment(int sayi) {
        sayi++;
        System.out.println("Metot içinde: sayi = " + sayi);
    }
    
    public static void main(String[] args) {
        int anaSayi = 10;
        
        System.out.println("Metot çağrısı öncesi: anaSayi = " + anaSayi);
        
        increment(anaSayi);
        
        System.out.println("Metot çağrısı sonrası: anaSayi = " + anaSayi);
    }
}
