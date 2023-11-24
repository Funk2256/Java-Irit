package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Давайте посчитаем, введите два числа и мы проведем операцию сложения: ");
        int a,b, ab;
        System.out.println("Число 1: ");
        a = in.nextInt();
        System.out.println("Число 2: ");
        b = in.nextInt();
        ab = a + b;
        System.out.printf("Результат %d", ab);
    }
}
