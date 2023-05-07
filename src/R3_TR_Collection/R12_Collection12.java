package R3_TR_Collection;

import java.util.HashSet;
import java.util.TreeSet;

/*
Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.

HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

Beklenen Çıktı:
Tree Set Elemanlari:
kirmizi
mavi
sari
turuncu
yesil
 */
public class R12_Collection12 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("sari");
        hashSet.add("kirmizi");
        hashSet.add("yesil");
        hashSet.add("turuncu");
        hashSet.add("mavi");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        treeSet.forEach(System.out::println);
    }
}
