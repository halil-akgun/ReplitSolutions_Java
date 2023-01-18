/*
Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
 */
public class R16_ENG_Method_Array_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int w : arr) {
            sum += w;
        }
        System.out.println(sum / arr.length);
    }
}
