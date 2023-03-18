import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse
"Dizenin benzersiz karakterleri var" yazdirin.

Input: ali
Output: ismin benzersiz karakterleri var.

Ternary kullanin.
 */
public class R52_TR_If_Switch_Ternary_StringMethods_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        List<String> letters = List.of(name.split(""));
        HashSet<String> uniqueLetters = new HashSet<>(letters);
        String result = name.length() == uniqueLetters.size() ? "ismin benzersiz karakterleri var." : "isim ayni karakterlere sahiptir.";
        System.out.println(result);
    }
}