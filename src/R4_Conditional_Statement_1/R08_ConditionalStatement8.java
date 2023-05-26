package R4_Conditional_Statement_1;

/*
1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

 Beklenen çıltı:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class R08_ConditionalStatement8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
            System.out.println(sb);
        }
    }
}
