import java.util.Scanner;

/*
Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,
"Talebiniz işleniyor" mesajı yazdırılır

yanıt b ise,
"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır

yanıt c ise,
"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

başka herhangi bir yanıt değeri için,
"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
 */
public class R50_TR_If_Switch_Ternary_StringMethods_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char chr = scanner.next().charAt(0);
        switch (chr) {
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiginiz için tesekkur ederiz");
                break;
            case 'c':
                System.out.println("Uzgunuz, su anda herhangi bir yardim yok");
                break;
            default:
                System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
        }
    }
}
