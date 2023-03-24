import java.util.Scanner;

/*
Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT   : Mustafa
OUTPUT  : fafafa
 */
public class R54_TR_If_Switch_Ternary_StringMethods_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.substring(name.length() - 2).repeat(3));
    }
}
