package R3_TR_Collection;

import java.util.ArrayList;
import java.util.List;

/*
Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

Array Elemanları: sari,yesil,mavi,pembe

**mavi rengini turuncu ile değiştirelim.**

Beklene Çıktı:
[sari,yesil,mavi,pembe]
[sari,yesil,turuncu,pembe]
 */
public class R04_Collection4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("sari", "yesil", "mavi", "pembe"));
        System.out.println(list);
        list.set(list.indexOf("mavi"), "turuncu");
        System.out.println(list);
    }
}
