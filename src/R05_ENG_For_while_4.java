/*
Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6
Output: 6!=6*5*4*3*2*1=720
 */
public class R05_ENG_For_while_4 {
    public static void main(String[] args) {
        int a = 6;
        String output = "";
        int factorial = 1;
        for (int i = a; i > 0; i--) {
            output += i + "*";
            factorial *= i;
        }
        output = output.substring(0, output.length() - 1);
        System.out.println(a + "!=" + output + "=" + factorial);

    }
}