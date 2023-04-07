package R1_Projects;

/*
Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT 		:   Sum of Natural Numbers 5050
 */
public class R11_R10_ENG_For_while_10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("Sum of Natural Numbers " + sum);
    }
}
