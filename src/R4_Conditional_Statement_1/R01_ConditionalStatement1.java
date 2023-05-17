package R4_Conditional_Statement_1;

import java.util.Scanner;

/*
Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.

Test data :21
Beklenen Çıktı:
 Sayı Pozitif

Test data :-15
Beklenen Çıktı:
 Sayı Negatif

Test data :0
Beklenen Çıktı:
 Sayı Sıfır
 */
public class R01_ConditionalStatement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) System.out.println("Sayı Pozitif");
        else if (num < 0) System.out.println("Sayı Negatif");
        else System.out.println("Sayı Sifir");
    }
}
