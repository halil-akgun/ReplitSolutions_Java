import java.util.Arrays;

/*
Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}
Input2={5,6}

Output={1,2,3,4,5,6}
 */
public class R19_ENG_Method_Array_8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int idx = 0;
        for (int w : arr1) {
            arr3[idx] = w;
            idx++;
        }
        for (int w : arr2) {
            arr3[idx] = w;
            idx++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
