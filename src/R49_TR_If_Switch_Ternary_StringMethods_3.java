import java.util.Scanner;

/*
Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:
INPUT      :
25
46

OUTPUT :
Numaralarin Toplami:
71
 */
public class R49_TR_If_Switch_Ternary_StringMethods_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("OverFlow");
        }
        System.out.println("Numaralarin Toplami: " + (a + b));
    }
}
