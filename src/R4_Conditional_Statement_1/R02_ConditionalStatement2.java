package R4_Conditional_Statement_1;

import java.util.Scanner;

/*
iki sayıyı kıyaslayan Java kodunu yazınınz.

** Kullanılacak Operatörler **
**Büyüktür >
**Küçüktür <
**Büyük yada eşit >=
**Küçük yada eşit <=
**Eşittir ==
**Eşit değildir !=

** Kullanılacak sayılar 25 ile 39 **
Beklenen Örnek Çıktı:
25 != 39
25 < 39
25 <= 39
 */
public class R02_ConditionalStatement2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number1 > number2) System.out.println(number1 + " > " + number2);
        if (number1 < number2) System.out.println(number1 + " < " + number2);
        if (number1 >= number2) System.out.println(number1 + " >= " + number2);
        if (number1 <= number2) System.out.println(number1 + " <= " + number2);
        if (number1 == number2) System.out.println(number1 + " == " + number2);
        if (number1 != number2) System.out.println(number1 + " != " + number2);
    }
}
