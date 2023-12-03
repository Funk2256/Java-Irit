package laba2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Введите число в диапазоне от 5 до 10");
        int numbers = in.nextInt();

        if (numbers >= 5 && numbers <= 10)
            System.out.println("Число в диапазоне");
        else {
            System.out.println("Число не в диапазоне");
        }
    }
}
