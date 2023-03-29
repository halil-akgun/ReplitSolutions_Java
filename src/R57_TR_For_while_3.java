import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :
String str=“Javaisalsoeasy”

Output: a s
 */
public class R57_TR_For_while_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> letters = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (letters.contains(str.substring(i, i + 1)) && !resultList.contains(str.substring(i, i + 1)))
                resultList.add(str.substring(i, i + 1));
            else letters.add(str.substring(i, i + 1));
        }
        resultList.forEach(t -> System.out.print(t + " "));
    }
}
