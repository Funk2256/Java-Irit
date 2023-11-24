package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 числа а программа покажет сумму и разность: ");
        int a,b, summ, difference;

        System.out.println("Введите первое число: ");
        a = in.nextInt();
        System.out.println("Введите второе число: ");
        b = in.nextInt();

        summ = a + b;
        difference = a - b;

        System.out.printf("Сумма: %d\nРазность: %d", summ, difference);
    }
}
