package R1_Projects;

import java.util.Scanner;

/*
Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez

Input:
Agirlik : 71
Boy : 1.72
Output:
BMI : 23.99945916711736
Zayifsiniz.
 */
public class R47_TR_If_Switch_Ternary_StringMethods_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI : " + bmi);
        if (bmi < 18.5) System.out.println("zayıfsınız");
        else if (bmi < 25) System.out.println("kilonuz idealdir");
        else if (bmi < 30) System.out.println("şişmansınız");
        else System.out.println("obez");
    }
}
