package R3_TR_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

Beklenen Çıktı:
Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
Tree eleman sayısı: 5
 */
public class R16_Collection16 {
    public static void main(String[] args) {
        TreeSet<String> treeSet =
                new TreeSet<>(List.of("yesil", "sari", "mavi", "kirmizi", "pembe"));
        System.out.println("Orjinal TreeSet: " + treeSet);
        System.out.println("Tree eleman sayısı: " + treeSet.size());

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
