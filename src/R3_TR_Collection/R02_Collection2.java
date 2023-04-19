package R3_TR_Collection;

import java.util.List;

/*
Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını ekleyen java kodunu yazınız.

Array List:  siyah,mavi,kirmizi,beyaz

en başa: 'pembe'
mavi-kirmizi arasına 'yesil'  renk eklenecek.

Beklenen Çıktı:
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
 */
public class R02_Collection2 {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>(List.of("siyah", "mavi", "kirmizi", "beyaz"));
        list.add(0, "pembe");
        list.add(list.indexOf("kirmizi"), "yesil");
        System.out.println(list);
    }
}
