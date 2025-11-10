public class GmtTime {
    public static void main(String[] args) {

        // 1 Ocak 1970'ten itibaren geçen toplam milisaniyeyi al
        long totalMilliseconds = System.currentTimeMillis();

        // Milisaniyeyi saniyeye çevir
        long totalSeconds = totalMilliseconds / 1000;

        // Toplam saniyeden dakikayı bul
        long totalMinutes = totalSeconds / 60;

        // Toplam dakikadan saati bul
        long totalHours = totalMinutes / 60;

        // Şu anki saniyeyi bul (dakika içindeki saniye)
        long currentSecond = totalSeconds % 60;

        // Şu anki dakikayı bul (saat içindeki dakika)
        long currentMinute = totalMinutes % 60;

        // Şu anki saati bul (gün içindeki saat, GMT)
        long currentHour = totalHours % 24;

        // Sonucu HH:MM:SS GMT formatında yazdır
        System.out.printf("Şu anki GMT saati: %02d:%02d:%02d GMT%n", currentHour, currentMinute, currentSecond);
    }
}
