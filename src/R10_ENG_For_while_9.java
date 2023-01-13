import java.util.Scanner;

/*
Write a java program to reverse the number which user entered.

Input  :1238
Output :Reverse Of The Number: 8321
 */
public class R10_ENG_For_while_9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        StringBuilder b = new StringBuilder(String.valueOf(a));
        b.reverse();
        System.out.println(b);
    }
}
