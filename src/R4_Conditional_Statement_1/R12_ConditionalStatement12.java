package R4_Conditional_Statement_1;

import java.util.Scanner;

/*
 Ugly Number:

Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.

Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

Test Data:
13
Beklenen çıktı:
ugly number  degildir

Test Data:
25
Beklenen Çıktı:
ugly number
 */
public class R12_ConditionalStatement12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0) System.out.println("ugly number");
        else System.out.println("ugly number  degildir");
    }
}
