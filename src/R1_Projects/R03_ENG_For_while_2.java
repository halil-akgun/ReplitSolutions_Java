package R1_Projects;

import java.util.Scanner;

/*
Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :
30 and 40

Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
 */
public class R03_ENG_For_while_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int min = Math.min(a, b);
        int gcd = a;
        int lcn = a;
        for (int i = min - 1; true; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        for (int i = 1; true; i++) {
            int temp1 = a * i;
            int temp2 = a;
            for (int j = 1; true; j++) {
                temp2 = b * j;
                if (temp1 == temp2) {
                    lcn = temp2;
                    break;
                } else if (temp2 > temp1) {
                    break;
                }
            }
            if (temp1 == temp2) break;
        }
        System.out.println("GCD for " + a + " and " + b + " = " + gcd);
        System.out.println("LCM for " + a + " and " + b + " = " + lcn);
    }
}
