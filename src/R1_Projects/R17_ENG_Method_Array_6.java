package R1_Projects;

/*
Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :
min: 1
max: 6
 */
public class R17_ENG_Method_Array_6 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 1, 6};
        int min = arr[0];
        int max = arr[0];
        for (int w : arr) {
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
