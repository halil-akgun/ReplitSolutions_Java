package R1_Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a program that deletes the letters 'a' from the names in the list given as input.

         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}

         OUTPUT :
         [Veli,Omer]
 */
public class R23_ENG_List_04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).toLowerCase().contains("a")) {
                names.remove(i);
                i--;
            }
        }
        System.out.println(names.toString().replaceAll(" ", ""));
    }
}
