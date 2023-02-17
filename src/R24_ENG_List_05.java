import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
Check numbers if they are even or not in a return method.

Input : 5
Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */
public class R24_ENG_List_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> primes = new ArrayList<>();
        boolean isPrime;
        for (int i = num + 1; i > num; i++) {
            isPrime = true;
            if (!isEven(i)) for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && !isEven(i)) {
                primes.add(i);
                if (primes.size() == 10) break;
            }
        }
        System.out.println(primes);
    }

    static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
