package R1_Projects;

import java.util.Scanner;

/*
Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

Input  :1238
Output :Girilen Numananin Tersi: 8321
 */
public class R63_R62_TR_For_while_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. yol
//        StringBuilder sb = new StringBuilder(scanner.next());
//        sb.reverse();
//        System.out.println("Girilen Numananin Tersi: " + sb);

        // 2. yol
        int num = scanner.nextInt();
//        StringBuilder sb2 = new StringBuilder(String.valueOf(num));
//        sb2.reverse();
//        System.out.println("Girilen Numananin Tersi: " + sb2);

        // 3. yol
        int result = 0;
        while (num != 0) {
            result = result * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Girilen Numananin Tersi: " + result);
    }
}
