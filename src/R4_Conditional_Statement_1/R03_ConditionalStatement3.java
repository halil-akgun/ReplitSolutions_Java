package R4_Conditional_Statement_1;

import java.util.Scanner;

/*
Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.

Test Data:
12
34
23

Beklenen Çıktı:
En Buyuk Sayi: 34
 */
public class R03_ConditionalStatement3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("En Buyuk Sayi: " + Math.max(Math.max(num1, num2), num3));

    }
}
