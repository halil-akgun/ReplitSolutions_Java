package R3_TR_Collection;

import java.util.List;
import java.util.PriorityQueue;

/*
Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

priority queue elemanları: sari,yesil,mavi,kirmizi

Beklenen Çıktı:
Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
 */
public class R18_Collection18 {
    public static void main(String[] args) {
        PriorityQueue<String> queue =
                new PriorityQueue<>(List.of("sari", "yesil", "mavi", "kirmizi"));
        System.out.println(queue);
    }
}
