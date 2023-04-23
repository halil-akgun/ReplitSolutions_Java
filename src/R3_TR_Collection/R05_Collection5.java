package R3_TR_Collection;

import java.util.ArrayList;
import java.util.List;

/*
Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

Beklenen Çıktı:
Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
siyah
mavi
kirmizi
yesil
mor
turuncu
 */
public class R05_Collection5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("siyah", "mavi", "kirmizi", "yesil", "mor", "turuncu"));
        System.out.println(list);
        list.forEach(System.out::println);
    }
}
