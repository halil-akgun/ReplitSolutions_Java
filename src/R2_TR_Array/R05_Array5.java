package R2_TR_Array;

import java.util.Arrays;
import java.util.Scanner;

/*
yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020
Beklenen Çıktı:**True**

Aranan Değer:2010
Beklenen Çıktı :**False**
 */
public class R05_Array5 {
    public static void main(String[] args) {
        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine(); // dummy
        System.out.println("**" + Arrays.stream(arr).anyMatch(t -> t == num) + "**");
    }
}
