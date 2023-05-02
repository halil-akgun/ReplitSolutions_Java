package R3_TR_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

**hint:  Collections.swap();**

Beklene Çıktı:
Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
 */
public class R10_Collection10 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(
                List.of("mavi", "kirmizi", "beyaz", "siyah", "yesil", "turuncu"));
        System.out.println("Orjinal LinkedList: " + list);
        Collections.swap(list, 0, 3);
        System.out.println("Swap sonrası durum: " + list);
    }
}
