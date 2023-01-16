/*
Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input  : Coding is greate.
Output : .etaerg si gnidoC
 */
public class R13_ENG_Method_Array_2 {
    public static void main(String[] args) {
        String str = "Coding is greate.";
        String[] arr = str.split("");
        String strReverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            strReverse += arr[i];
        }
        System.out.println(strReverse);
    }
}
