import java.util.Comparator;
import java.util.stream.IntStream;

/*
100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT  :
100 98 96 94 92 … … … … 2 0
 */
public class R59_TR_For_while_5 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100).
                filter(t -> t % 2 == 0).
                boxed().
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }
}