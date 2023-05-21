package R4_Conditional_Statement_1;

import java.util.Scanner;

/*
1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.

Test Data :
3
Beklenen Çıktı:
Carsamba

Test Data:
1
Beklenen Çıktı:
Pazartesi
 */
public class R04_ConditionalStatement4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Carsamba");
            case 4 -> System.out.println("Persembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Hatali giris");
        }
    }
}
