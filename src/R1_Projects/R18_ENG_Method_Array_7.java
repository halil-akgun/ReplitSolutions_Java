package R1_Projects;

/*
Write a method that accepts an array as parameter and returns sum of all elements in the array Then print the result in the main method.

Eg :
input : {1,2,3,4,5,6,7,8};

output: 36
 */
public class R18_ENG_Method_Array_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int w : arr) {
            sum += w;
        }
        System.out.println(sum);
    }
}
