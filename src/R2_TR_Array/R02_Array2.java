package R2_TR_Array;

/*
Array deki sayıları tolpayan Java kodunu yazınız.

array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Beklenen Çıktı:
Array toplamı: 55
 */
public class R02_Array2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int w : arr) {
            sum += w;
        }
        System.out.println("Array toplamı: " + sum);
    }
}
