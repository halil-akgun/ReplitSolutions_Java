package R4_Conditional_Statement_1;

/* ReplitSolutions
Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.

Test Data:
Yarım elmas uzunluğu : 7

Beklenen Çıktı:

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
public class R09_ConditionalStatement9 {
    public static void main(String[] args) {
        int length = 7;
        printDiamond(length);
    }

    public static void printDiamond(int length) {
        printDiamondRecursive(length, length - 1, 1);
    }

    public static void printDiamondRecursive(int length, int space, int filling) {
        if (length > 1) {
            print(space, filling);
            length--;
            printDiamondRecursive(length, space - 1, filling + 2);
        }
        if (length > 1) {
            print(space, filling);
        }
        if (length == 1) {
            print(space, filling);
        }
    }

    public static void print(int space, int filling) {
        System.out.print(" ".repeat(space));
        System.out.print("*".repeat(filling));
        System.out.println(" ".repeat(space));
    }
}
