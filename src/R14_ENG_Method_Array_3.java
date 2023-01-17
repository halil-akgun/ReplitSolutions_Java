/*
Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3
output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()
 */
public class R14_ENG_Method_Array_3 {
    public static void main(String[] args) {
        String a = "ade1r4d3";
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(a.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
