package laba3;

import java.util.Arrays;
import java.util.Scanner;

public class Example4_1 {
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

        for (int i = min; i <= max; i++){
            System.out.println(i);
        }
    }
}
