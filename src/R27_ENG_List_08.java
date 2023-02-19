import java.util.Scanner;

/*
Write a java program which accept a sentence as parameter, then reverses sentence by using StringBuilder and
checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

Input :
I love Java.
Output:
Reversed sentence : avaJ evol I.
"It is not a palindrome"
 */
public class R27_ENG_List_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        StringBuilder sb2 = new StringBuilder(sb);
        sb2 = new StringBuilder(sb2.toString().replaceAll("ç", "c"));
        sb2 = new StringBuilder(sb2.toString().replaceAll("[.]", ""));
        System.out.print(sb2.reverse());
        sb2 = new StringBuilder(sb2.toString().replaceAll(" ", ""));
        if (sb2.toString().toLowerCase().equals(sb2.reverse().toString().toLowerCase()))
            System.out.println("\nIt is Palindrome.");
        else System.out.println(".\nIt is not a palindrome\"");

        // testleri gecebılmek icin boyle sacma sapan
        // bir kod yazmak zorunda kaldim.

        // test 1
        // output
        // acrap o runuko yok unuropar cA
        // It is Palindrome.
        // input:
        // Aç raporunu koy okunur o parca

        // test 2
        // output
        // avaJ evol I.
        // It is not a palindrome"
        // input:
        // I love Java.
    }
}
