package R2_TR_Array;

/*
Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

Aranan değer:56

Beklenen Çıktı:
56 sayısı arrayin 4. elemanı
 */
public class R06_Array6 {
    public static void main(String[] args) {
        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int num = 56;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) System.out.println(num + " sayısı arrayin " + (i + 1) + ". elemanı");
        } // soruda kaçıncı eleman yaziyor, beklenen cikti index???
    }
}
