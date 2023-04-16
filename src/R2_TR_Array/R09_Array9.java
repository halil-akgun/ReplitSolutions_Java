package R2_TR_Array;

import java.util.Arrays;

/*
Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

Array: [1,2,3,4,5,6,7,8,9]

Beklenen Çıktı:
Tek Sayilar: 5
Cift Sayilar: 4
 */
public class R09_Array9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long oddNums = Arrays.stream(arr).filter(t -> t % 2 != 0).count();
        long evenNums = Arrays.stream(arr).filter(t -> t % 2 == 0).count();
        System.out.println("Amount of Odd Numbers: " + oddNums);
        System.out.println("Amount of Even Numbers: " + evenNums);
    }
}
