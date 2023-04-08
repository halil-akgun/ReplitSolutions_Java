package R2_TR_Array;

import java.util.Arrays;

/*
Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

Test Data:
[1232, 1134,2345,1022]
[Java, Python, PHP, C#, C Programming, C++]

Beklenen Çıktı:
[1022,1134,1232,2345]
[C Programming, C#, C++, Java, PHP, Python]
 */
public class R01_Array1 {
    public static void main(String[] args) {
        int[] arr1 = {1232, 1134, 2345, 1022};
        String[] arr2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
