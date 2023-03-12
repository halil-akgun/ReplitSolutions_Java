import java.util.Scanner;

/*
Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
 */
public class R42_R41_TR_Scanner_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println((short) a);
        scanner.close();
    }
}
