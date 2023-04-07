package R1_Projects;

import java.util.Scanner;

/*
Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.

Input :
6
Output:
6 Mukemmel Sayidir.

======================

Input
7
Output:
7 Mukemmel Sayidir degildir.
 */
public class R61_TR_For_while_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        if (num == sum) System.out.println(num + " Mukemmel Sayidir.");
        else System.out.println(num + " Mukemmel Sayidir degildir.");
    }
}
