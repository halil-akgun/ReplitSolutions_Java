import java.util.Scanner;

/*
Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :
John White
1234234534561478

Output : Name :
J*** W****
CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir.
 */
public class R48_TR_If_Switch_Ternary_StringMethods_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameArr = scanner.nextLine().split(" ");
        String ccn = scanner.nextLine();
        StringBuilder name = new StringBuilder();
        for (String w : nameArr) {
            name.append(w.substring(0, 1).toUpperCase());
            name.append("*".repeat(w.length() - 1)).append(" ");
        }
        System.out.println(name);
        System.out.println("CCN  : **** **** **** " + ccn.substring(ccn.length() - 4));
    }
}