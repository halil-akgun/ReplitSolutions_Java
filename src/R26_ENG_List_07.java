import java.util.ArrayList;
import java.util.List;

/*
write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]
 */
public class R26_ENG_List_07 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        int remove = 6;
        List<Integer> output = new ArrayList<>();
        for (int w : list) {
            if (w != remove) output.add(w);
        }
        System.out.println(output.toString().replaceAll(" ", ""));
    }
}
