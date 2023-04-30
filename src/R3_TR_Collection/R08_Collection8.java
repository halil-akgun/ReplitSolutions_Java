package R3_TR_Collection;

import java.util.LinkedList;
import java.util.List;

/*
Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

Beklenen Çıktı:
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
Listenin ilk elemani: sari
listenin son elemani: beyaz
 */
public class R08_Collection8 {
    public static void main(String[] args) {
        LinkedList<String> list =
                new LinkedList<>(List.of("sari", "mavi", "turuncu", "siyah", "yesil", "beyaz"));
        System.out.println("Orjinal list elemanlari: " + list);
        System.out.println("Listenin ilk elemani: " + list.getFirst());
        System.out.println("Listenin son elemani: " + list.getLast());
    }
}
