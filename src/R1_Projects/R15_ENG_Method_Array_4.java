package R1_Projects;

import java.util.Arrays;

/*
Create a custom return type method accepts a name as parameter and prints the name as a char array.
(do not use toCharArray() method)

Input : John
Output :[J, o, h, n]
 */
public class R15_ENG_Method_Array_4 {
    public static void main(String[] args) {
        String a = "John";
        System.out.println(Arrays.toString(a.split("")));
    }
}
