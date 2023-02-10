import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

input :
Learning java is easy
output:
maximum occurring character is : a
 */
public class R20_ENG_List_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().toLowerCase().split("");
        Map<String, Integer> letters = new HashMap<>();
        for (String w : str) {
            letters.merge(w, 1, Integer::sum);
        }
        int max = 0;
        String result = "";
        for (Map.Entry<String, Integer> w : letters.entrySet()) {
            if (w.getValue() > max) {
                max = w.getValue();
                result = w.getKey();
            }
        }
        System.out.println("maximum occurring character is : " + result);
    }
}
