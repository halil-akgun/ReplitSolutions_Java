import java.util.Scanner;
import java.util.stream.IntStream;

/*
Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=6*5*4*3*2*1=720
 */
public class R58_TR_For_while_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String output = "";
        for (int i = num; i > 0; i--) {
            output += i + "*";
        }
        System.out.print(num + "!=" + output.substring(0, output.length() - 1) + "=" + calculateFactorial(num));

    }

    static int calculateFactorial(int a) {
        return IntStream.rangeClosed(2, a).reduce(1, (t, u) -> t * u);
    }
}
