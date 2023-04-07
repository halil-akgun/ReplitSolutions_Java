package R1_Projects;

import java.util.Scanner;

/*
Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:
Dakika sayısı: 3456789

OUTPUT :
3456789 dakika yaklaşık 6 yıl 210 gündür
 */
public class R46_TR_Scanner_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minute = scanner.nextInt();
        int day = minute / 60 / 24;
        System.out.println(minute + " dakika yaklasik " + day / 365 + " yil " + day % 365 + " gundur");
    }
}
