/*
Write a java program which accept a sentence as parameter, then reverses sentence by using StringBuilder
   and checks if sentence is palindrome or not
   (without case sensitivity)
   Eg : input : I love Java
   Output: "Reversed sentence : avaJ evol I .
   It is not a palindrome"


 */
public class R30_ENG_StringBuilder_01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love Java");
        System.out.println(sb.reverse());
    }
}
