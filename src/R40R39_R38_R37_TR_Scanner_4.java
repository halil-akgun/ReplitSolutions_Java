import java.util.Scanner;

/*
Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


1 şeker = 1.7 gr

Örnek Çıktı:
çay=10
şeker=2
Yılda 12.41 kg şeker kullanıyor.
 */
public class R40R39_R38_R37_TR_Scanner_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tea = scanner.nextInt();
        int sugar = scanner.nextInt();
        System.out.println("Yilda " + (tea * sugar * 1.7) * 365 / 1000 + " kg seker kullaniyor.");
    }
}
