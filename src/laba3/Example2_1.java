package laba3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();



        switch (day) {
            case "Понедельник":
                System.out.println("1");
                break;
            case "Вторник":
                System.out.println("2");
                break;
            case "Среда":
                System.out.println("3");
                break;
            case "Четверг":
                System.out.println("4");
                break;
            case "Пятница":
                System.out.println("5");
                break;
            case "Суббота":
                System.out.println("6");
                break;
            case "Воскресенье":
                System.out.println("7");
                break;
            case "понедельник":
                System.out.println("1");
                break;
            case "вторник":
                System.out.println("2");
                break;
            case "среда":
                System.out.println("3");
                break;
            case "четверг":
                System.out.println("4");
                break;
            case "пятница":
                System.out.println("5");
                break;
            case "суббота":
                System.out.println("6");
                break;
            case "воскресенье":
                System.out.println("7");
                break;
            default:
                System.out.println("Что-то не то");
        }
    }
}
