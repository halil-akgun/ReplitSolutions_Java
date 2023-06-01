package R4_Conditional_Statement_1;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf
olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
(Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

Sesli harfler: a,e,i,o,u

Test Data:
a
Beklenen Çıktı:
a harfi sesli harftir.
Test Data:
d
Beklenen Çıktı:
d harfi sessiz harftir.
Test Data:
we  ya da %
Beklenen Çıktı:
Yanlis karakter girdiniz!
 */
public class R11_ConditionalStatement11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(checkChar(str));
    }

    private static String checkChar(String str) {

        boolean isOneChar = str.length() == 1;
        boolean isLetter = Pattern.matches("[A-Za-zÇçĞğIıİiÖöŞşÜü]", str);

        Pattern vowelPattern = Pattern.compile("[aeiouıüöAEIOUİÜÖ]", Pattern.CASE_INSENSITIVE);
        boolean isVowel = vowelPattern.matcher(str).find();

        if (!isOneChar || !isLetter) return "Yanlis karakter girdiniz!";
        return isVowel ? str + " harfi sesli harftir." : str + " harfi sessiz harftir.";
    }
}
