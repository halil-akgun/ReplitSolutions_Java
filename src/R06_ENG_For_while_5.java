/*
Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
 */
public class R06_ENG_For_while_5 {
    public static void main(String[] args) {
        System.out.print("Even Numbers from 20 to 0 are: ");
        for (int i = -20; i < 1; i++) {
            if (i%2==0) System.out.print(-i + " ");
        }
    }
}