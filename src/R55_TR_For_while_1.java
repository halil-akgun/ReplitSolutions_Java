import java.util.Scanner;

/*
Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

String name =“John came late"
char ch1= 'a' ;

Expected Output:
Number of a = 2
 */
public class R55_TR_For_while_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char ch1 = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch1) count++;
        }
        System.out.println("Number of " + ch1 + " = " + count);
    }
}
