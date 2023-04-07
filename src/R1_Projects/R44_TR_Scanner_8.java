package R1_Projects;

import java.util.Scanner;

/*
Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:
   Verilen tamsayının rakamları toplamı 10'dur.
 */
public class R44_TR_Scanner_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] arr = String.valueOf(num).split("");
        int sum = 0;
        for (String w : arr) {
            sum += Integer.parseInt(w);
        }
        System.out.println("Verilen tamsayinin rakamlari toplami " + sum + "'dur.");
    }
}
