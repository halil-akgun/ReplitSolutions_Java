package R3_TR_Collection;

import java.util.*;

/*
Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve
ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

Beklenen Çıktı:

Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

Tersten Siralanisi:
yesil
turuncu
sari
mavi
kirmizi
 */
public class R14_Collection14 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(List.of("yesil", "sari", "mavi", "turuncu", "kirmizi"));
        System.out.println("Orjinal Tree sonucu: " + treeSet);
        descendingIterator(treeSet);
    }

    private static void descendingIterator(TreeSet<String> treeSet) {
        List<String> list = new ArrayList<>(treeSet);
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) iterator.next();
        System.out.println("Tersten Siralanisi:");
        while (iterator.hasPrevious()) System.out.println(iterator.previous());
    }
}
