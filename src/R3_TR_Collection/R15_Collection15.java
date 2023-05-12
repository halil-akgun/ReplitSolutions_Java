package R3_TR_Collection;

import java.util.Arrays;
import java.util.TreeSet;

/*
Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

Beklenen Çıktı:

Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
ilk elemen: kirmizi
son eleman: yesil
 */
public class R15_Collection15 {
    public static void main(String[] args) {
        TreeSet<String> treeSet =
                new TreeSet<>(Arrays.asList("kirmizi", "mavi", "pembe", "sari", "turuncu", "yesil"));
        System.out.println("Orjinal Tree: " + treeSet);
        System.out.println("ilk elemen: " + treeSet.first());
        System.out.println("son elemen: " + treeSet.last());
    }
}
