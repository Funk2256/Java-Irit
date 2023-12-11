package laba3;

import java.util.Arrays;
import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int [] numbers = {number1, number2};

        int min = Arrays.stream(numbers)
                .min()
                .orElseThrow();

        int max = Arrays.stream(numbers)
                .max()
                .orElseThrow();
        while (min != max) {
            System.out.println(min++);
        }
            System.out.println(max);
    }
}
