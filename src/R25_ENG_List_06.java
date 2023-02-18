import java.util.ArrayList;
import java.util.List;

/*
Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}
Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
 */
public class R25_ENG_List_06 {
    public static void main(String[] args) {
        String[] list1 = {"John", "Brad", "Ange", "Sofia", "Emily"};
        String[] list2 = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> output = new ArrayList<>();
        for (String w : list2) {
            for (String s : list1) {
                if (w.equalsIgnoreCase(s)) {
                    output.add(w);
                    break;
                }
            }
        }
        System.out.println(output.toString().replaceAll(" ", ""));
    }
}
