package R1_Projects;

import java.util.Scanner;

/*
Ask user to enter a name and a character, then check how many times
the character is repeated in the name using loops in the name

e.g:
char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2
 */
public class R02_ENG_For_while_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String text = inp.nextLine();
        char ch = inp.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (ch == text.charAt(i)) counter++;
        }
        System.out.println("Number of " + ch + " = " + counter);

    }
}
