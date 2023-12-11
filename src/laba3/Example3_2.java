package laba3;

import java.util.Scanner;

public class Example3_2 {
    public static void main(String[] args) {
        System.out.println("Числа Фибоначчи\nВведите два числа например 1 и 1");
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3;
        int count = 0;

        System.out.println("Ваши числа: " + number1 + " " + number2  + " " + "\nРяд чисел Фибоначчи:");

        while (count < 10) {
            number3=number1+number2;
            System.out.print(number3 + " ");
            number1=number2;
            number2=number3;
            count++;

        }
    }
}
