package R3_TR_Collection;

import java.util.ArrayList;
import java.util.List;

/*
Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

Beklenen Çıktı:
Arrayin 1. elemani: beyaz
Arrayin 3. elemani: sari
 */
public class R03_Collection3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of(new String[]{"beyaz", "siyah", "sari", "kirmizi", "turuncu"}));
        System.out.println("Arrayin 1. elemani: " + list.get(0));
        System.out.println("Arrayin 3. elemani: " + list.get(2));
    }
}
