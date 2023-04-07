package R1_Projects;

import java.util.stream.IntStream;

/*
1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:
Sayilarin Toplami : 5050
 */
public class R63_TR_For_while_10 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 100).reduce(Integer::sum).getAsInt();
        System.out.println("Sayilarin Toplami : " + sum);
    }
}
