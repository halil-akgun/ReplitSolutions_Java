import java.util.Scanner;

/*
Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:
1 saat 10 dakika 50 saniye ==>
4250 saniye
 */
public class R45_R44_TR_Scanner_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println((hour * 60 * 60) + (minute * 60) + second + " saniye");
    }
}
