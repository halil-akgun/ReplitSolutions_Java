import java.util.Scanner;

/*
Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :
Alan: 9
Cevre: 12
 */
public class R38_R37_TR_Scanner_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Alan: " + (a * a));
        System.out.println("Cevre: " + (a * 4));
    }
}
