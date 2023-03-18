import java.util.Scanner;

/*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016

OUTPUT  :
Subat 2016 29 Gundur.
 */
public class R51_TR_If_Switch_Ternary_StringMethods_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Ocak " + year + " 31 Gundur.");
                break;
            case 2:
                if (isLeapYear(year)) System.out.println("Subat " + year + " 29 Gundur.");
                else System.out.println("Subat " + year + " 28 Gundur.");
                break;
            case 3:
                System.out.println("Mart " + year + " 31 Gundur.");
                break;
            case 4:
                System.out.println("Nisan " + year + " 30 Gundur.");
                break;
            case 5:
                System.out.println("Mayis " + year + " 31 Gundur.");
                break;
            case 6:
                System.out.println("Haziran " + year + " 30 Gundur.");
                break;
            case 7:
                System.out.println("Temmuz " + year + " 31 Gundur.");
                break;
            case 8:
                System.out.println("Agustos " + year + " 31 Gundur.");
                break;
            case 9:
                System.out.println("Eylul " + year + " 30 Gundur.");
                break;
            case 10:
                System.out.println("Ekim " + year + " 31 Gundur.");
                break;
            case 11:
                System.out.println("Kasim " + year + " 30 Gundur.");
                break;
            case 12:
                System.out.println("Aralik " + year + " 31 Gundur.");
                break;
            default:
                System.out.println("incorrect entry");
        }
    }

    static boolean isLeapYear(int year) {
        boolean rule1 = year % 100 == 0 && year % 400 == 0;
        boolean rule2 = year % 4 == 0;
        boolean rule3 = year % 4000 != 0;
        return year % 100 == 0 && rule3 ? rule1 : rule2 && rule3;
    }
}
