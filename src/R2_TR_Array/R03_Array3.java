package R2_TR_Array;

/*
Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]

Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
 */
public class R03_Array3 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int w : arr) {
            sum += w;
        }
        System.out.printf("Array Sayılarının ortalaması: %.1f", Math.floor((double) sum / arr.length));
    }
}
