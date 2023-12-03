package laba2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число больше 10 и которое делится на 4 без остатка");

        int numbers = in.nextInt();

        if (numbers % 4  == 0 && numbers > 10)
            System.out.println("Делится на 4 без остатка и больше 10");
        else
            System.out.println("Не соответствует условиям");
    }
}
