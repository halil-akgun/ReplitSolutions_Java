package R1_Projects;

/*
'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.

Ascii value of a = 97
Ascii value of b = 98
...
Ascii value of y = 121
Ascii value of z = 122
 */
public class R62_TR_For_while_8 {
    public static void main(String[] args) {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println("Ascii value of " + (char) i + " = " + i);
        }
    }
}
