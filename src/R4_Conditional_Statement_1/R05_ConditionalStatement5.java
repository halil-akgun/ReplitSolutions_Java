package R4_Conditional_Statement_1;

import java.time.LocalDate;
import java.util.Scanner;

/*
1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve
o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

Test Data:
2
2016
Beklenen çıktı:
2016 yili Subat ayi 29 gun

Test Data:
4
1998
Beklenen Çıktı:
1998 yili Nisan ayi 30 gun
 */
public class R05_ConditionalStatement5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        int day = LocalDate.of(year, month, 1).lengthOfMonth();
        String monthString = LocalDate.of(year, month, 1).getMonth().toString();
        System.out.println(year + " yili " + monthString + " ayi " + day + " gun");
    }
}
