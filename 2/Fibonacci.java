public class Fibonacci {
    public static void main(String[] args) {
        int num = 4;
        int a = 0, b = 1;
        if (num == a || num == b) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
            return;
        }
        int c = a + b;
        while (c <= num) {
            if (c == num) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
                return;
            }
            a = b;
            b = c;
            c = a + b;
        }

        System.out.println(num + " não pertence à sequência de Fibonacci.");
    }
}
