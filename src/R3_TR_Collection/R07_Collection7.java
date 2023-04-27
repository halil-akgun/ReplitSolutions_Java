package R3_TR_Collection;

import java.util.LinkedList;
import java.util.List;

/*
bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan
istenilen pozisyondan başlayarak listeyi yazdıralım.

LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

1. elemandan itibaren yazdıralım.

 Beklenen Çıktı:
beyaz
mavi
yesil
turuncu
 */
public class R07_Collection7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("sari", "beyaz", "mavi", "yesil", "turuncu"));
        int listFrom = 1;
        list.stream().skip(listFrom).forEach(System.out::println);
    }
}
