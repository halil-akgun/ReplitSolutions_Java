package R3_TR_Collection;

import java.util.List;

/*
Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

Array elemanları:  siyah,sari,mavi,turuncu

Beklenen Çıktı:
siyah
sari
mavi
turuncu
 */
public class R01_Collection1 {
    public static void main(String[] args) {
        List<String> list = List.of("siyah", "sari", "mavi", "turuncu");
        list.forEach(System.out::println);
    }
}
