package laba6;

public class Example5 {
    public static void main(String[] args) {
        int n = 7;
        int sum = sumOfSquares(n);
        System.out.println("Сумма квадратов натуральных чисел: " + sum);
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
