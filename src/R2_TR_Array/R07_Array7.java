package R2_TR_Array;

import java.util.List;

/*
Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]
 */
public class R07_Array7 {
    public static void main(String[] args) {
        String[] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list = List.of(arr);
        System.out.println(list);
    }
}
