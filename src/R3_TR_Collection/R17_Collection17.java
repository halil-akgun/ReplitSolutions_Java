package R3_TR_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tek tek karşılaştırıp aynı olanlar için "yes"
farklı olanlar için "no" yazdıralım.

1. TreeSet: mavi,yesil,kirmizi,sari
2. TreeSet: yesil,mavi,pembe,turuncu

Beklenen Çıktı:

1. TreeSet: [kirmizi,mavi,sari,yesil]
2. TreeSet: [mavi,pembe,turuncu,yesil

Karsilastirma Sonucu:
no
yes
no
yes
 */
public class R17_Collection17 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>(List.of("mavi", "yesil", "kirmizi", "sari"));
        TreeSet<String> set2 = new TreeSet<>(List.of("yesil", "mavi", "pembe", "turuncu"));
        Iterator<String> iterator1 = set1.iterator();
        Iterator<String> iterator2 = set2.iterator();

        System.out.println(set1);
        System.out.println(set2);

        while (iterator1.hasNext()) {
            if (iterator1.next().equals(iterator2.next())) System.out.println("yes");
            else System.out.println("no");
        }
        // tek tek karsilastirildi: 1 adet yes olmali
    }
}
