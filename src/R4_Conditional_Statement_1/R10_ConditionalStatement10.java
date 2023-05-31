package R4_Conditional_Statement_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.

Beklenen Çıktı:

      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 */
public class R10_ConditionalStatement10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        pascalsTriangle(a);
    }

    public static void pascalsTriangle(int a) {

        List<int[]> list = new ArrayList<>();
        int[] arrPrev = new int[1];
        int[] arrNew = new int[1];

        while (arrNew.length <= a) {

            arrNew[0] = 1;
            arrNew[arrNew.length - 1] = 1;

            for (int i = 1; i < arrNew.length - 1; i++) {
                arrNew[i] = arrPrev[i - 1] + arrPrev[i];
            }
            list.add(arrNew);
            arrPrev = arrNew;
            arrNew = new int[arrPrev.length + 1];
        }

        print(list);
    }

    private static void print(List<int[]> list) {

        int count = list.size();

        for (int[] w : list) {
            System.out.print(" ".repeat(count--));
            for (int a : w) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
