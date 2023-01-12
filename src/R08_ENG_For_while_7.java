import java.util.Scanner;

/*
Write java code checking the number is Perfect number or not.

* Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.

Input :6
Output:6 is Perfect Number
Input :7
Output:7 is not Perfect Number
 */
public class R08_ENG_For_while_7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int positiveDivisorsTotal = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) positiveDivisorsTotal += i;
        }
        if (n == positiveDivisorsTotal) {
            System.out.println(n + " is Perfect Number");
        } else {
            System.out.println(n + " is not Perfect Number");
        }
    }
}
