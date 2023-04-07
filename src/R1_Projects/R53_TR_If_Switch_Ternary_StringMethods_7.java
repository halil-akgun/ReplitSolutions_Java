package R1_Projects;

import java.util.Scanner;

/*
2 kelime oluşturun: isim1 ve isim2

isim1 çift sayıda karakter içeriyorsa, ikinci kelimeyi ilk adın ortasına yerleştirin
ilk kelime tek sayida karakter iceriyorsa
“isim1, isim2 ye eklenemiyor.” yazdırın

Örneğin:
isim1= mehmet
isim2= ahmet
Yazdır ==> mehahmetmet

isim1= memet
isim2= ahmet
Yazdır ==> isim1, isim2 ye eklenemiyor
 */
public class R53_TR_If_Switch_Ternary_StringMethods_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        if (name1.length() % 2 == 0)
            System.out.println(name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2));
        else System.out.println("isim1, isim2 ye eklenemiyor.");
    }
}
