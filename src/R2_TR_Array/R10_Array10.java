package R2_TR_Array;

import java.util.Scanner;

/*
Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

Test Data:
sentence -> "Java is fun"
reversed -> "fun is Java**"
 */
public class R10_Array10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        StringBuilder reversed = new StringBuilder();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed.append(sentence.charAt(i));
        }

        System.out.println(reversed);
    }
}
