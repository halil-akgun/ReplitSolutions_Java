package R3_TR_Collection;

import java.util.List;
import java.util.TreeSet;

/*
Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

Beklenen Çıktı:
beyaz
kirmizi
mavi
sari
siyah
yesil
 */
public class R13_Collection13 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(List.of("yesil", "mavi", "kirmizi", "sari", "beyaz", "siyah"));
        treeSet.forEach(System.out::println);
    }
}
