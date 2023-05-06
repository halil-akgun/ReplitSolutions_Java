package R3_TR_Collection;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/*
HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.

HashSet List: sari,mavi,kirmizi,yesil,mor

Beklenen Çıktı:
TreeSet elements:
kirmizi
mavi
mor
sari
yesil
 */
public class R11_Collection11 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(List.of("sari", "mavi", "kirmizi", "yesil", "mor"));
        TreeSet<String> treeSet = new TreeSet<>(set);
        treeSet.forEach(System.out::println);
    }
}
