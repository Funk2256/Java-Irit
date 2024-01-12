package laba6;

public class Example4 {
    public static void main(String[] args) {
        int number = 5;
        int doubleFactorial = DoubleFactorial.calculate(number);
        System.out.println(number + "!! = " + doubleFactorial);

    }

    public class DoubleFactorial {
        public static int calculate(int n) {
            if (n <= 0) {
                return 1;
            }
            int result = 1;
            for (int i = n; i > 0; i -= 2) {
                result *= i;
            }
            return result;
        }
    }
}
