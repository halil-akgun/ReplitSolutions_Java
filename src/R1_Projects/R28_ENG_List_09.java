package R1_Projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Write a Java program to get a String from user as input and find the maximum occurring character in that string.
(Ignore case sensitivity).

Input : Learning java is easy

Output: maximum occurring character is : a
 */
public class R28_ENG_List_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().toLowerCase().split("");
        Map<String, Integer> chars = new HashMap<>();
        for (String w : str) {
            if (chars.containsKey(w)) chars.replace(w, chars.get(w) + 1);
            else chars.put(w, 1);
        }
        String maxChar = "";
        int quantity = 0;
        for (Map.Entry<String, Integer> w : chars.entrySet()) {
            if (w.getValue() > quantity) {
                maxChar = w.getKey();
                quantity = w.getValue();
            }
        }
        System.out.println("maximum occurring character is : " + maxChar);
    }
}
