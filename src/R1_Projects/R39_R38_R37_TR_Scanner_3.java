package R1_Projects;

import java.util.Scanner;

/*
Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:
Alan: 32
Çevre: 24
 */
public class R39_R38_R37_TR_Scanner_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Alan: " + (a * b));
        System.out.println("Cevre: " + ((a * 2) + (b * 2)));
    }
}
