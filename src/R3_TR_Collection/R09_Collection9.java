package R3_TR_Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

Beklenen Çıktı:

Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]

LinkedList Tersi:
mor
beyaz
kirmizi
yesil
mavi
sari
 */
public class R09_Collection9 {
    public static void main(String[] args) {
        LinkedList<String> list =
                new LinkedList<>(List.of("sari", "mavi", "yesil", "kirmizi", "beyaz", "mor"));

        System.out.println("Orijinal linked list: " + list);

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) iterator.next();
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
