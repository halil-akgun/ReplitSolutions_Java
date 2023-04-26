package R3_TR_Collection;

import java.util.LinkedList;

/*
Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

LinkedList elemanları: sari,mavi,mor,yesil,beyaz

Beklenen Çıktı:
sari
mavi
mor
yesil
beyaz
 */
public class R06_Collection6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("sari");
        list.add("mavi");
        list.add("mor");
        list.add("yesil");
        list.add("beyaz");
        list.forEach(System.out::println);
    }
}
