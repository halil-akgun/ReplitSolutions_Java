package R4_Conditional_Statement_1;

import java.util.Scanner;

/*
Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

Örnek Sonuç:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
 */
public class R07_ConditionalStatement7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
