import java.util.Scanner;

/*
Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) yazdirin.

Input:
30
40

Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
 */
public class R56_TR_For_while_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " ve " + b + " icin GCD = " + gcd(a, b));
        System.out.println(a + " ve " + b + " icin LCM = " + lcm(a, b));
    }

    static int gcd(int a, int b) {
        if (b < a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int result = 0;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    static int lcm(int a, int b) {
        if (b < a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int result = 0;
        for (int i = b; i > 0; i = i + b) {
            for (int j = a; j > 0; j = j + a) {
                if (i == j || j > i) {
                    result = j;
                    break;
                }
            }
            if (i == result) break;
        }
        return result;
    }
}
