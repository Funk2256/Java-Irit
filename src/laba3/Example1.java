package laba3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Введите число соответствующее дню недели: ");
        Scanner in = new Scanner(System.in);
        int number_day = in.nextInt();


        switch (number_day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Что-то не то");
        }
    }
}
