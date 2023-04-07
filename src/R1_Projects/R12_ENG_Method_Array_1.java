package R1_Projects;

/*
Write a return method to reverse number.

Input  : 12345
Output : 54321
 */
public class R12_ENG_Method_Array_1 {
    public static void main(String[] args) {
        int a = 12345;
        System.out.println(intReverse(a));
    }
    public static int intReverse(int a){
        StringBuilder b = new StringBuilder(String.valueOf(a));
        b.reverse();
        return Integer.parseInt(b.toString());
    }
}
