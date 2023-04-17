package R2_TR_Array;

import java.util.Scanner;

/*
Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.

Test Data:
birinci binary number:  100010
ikinci  binary number:  110010
Beklenen Çıktı       : 1010100
 */
public class R11_Array11 {
    public static void main(String[] args) {
//        long binary1, binary2;
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        Scanner in = new Scanner(System.in);
//        binary1 = in.nextLong();
//        binary2 = in.nextLong();
//
//        for (int j = sum.length - 1; j >= 0; j--) {
//            if (binary1 == 0 || binary2 == 0) {
//                if (remainder == 1) sum[j] = 1;
//                break;
//            }
//
//            if (binary1 % 10 + binary2 % 10 + remainder == 0) i = 0;
//            else if (binary1 % 10 + binary2 % 10 + remainder == 1) {
//                i = 1;
//                remainder = 0;
//            } else if (binary1 % 10 + binary2 % 10 + remainder == 2) {
//                i = 0;
//                remainder = 1;
//            } else {
//                i = 1;
//                remainder = 1;
//            }
//            sum[j] = i;
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//            System.out.println("i " + binary1);
//        }
//        StringBuilder result = new StringBuilder();
//        for (int w : sum) {
//            result.append(w);
//        }
//        System.out.println(Long.parseLong(result.toString()));

        // without array
        Scanner scanner = new Scanner(System.in);
        long binary1 = scanner.nextLong();
        long binary2 = scanner.nextLong();
        scanner.close();

        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (binary1 != 0 || binary2 != 0 || carry != 0) {
            int sum = (int) (binary1 % 10 + binary2 % 10 + carry);
            carry = sum / 2;
            result.insert(0, sum % 2);
            binary1 /= 10;
            binary2 /= 10;
        }
        System.out.println(result);
    }
}
