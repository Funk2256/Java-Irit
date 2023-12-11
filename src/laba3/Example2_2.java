package laba3;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();

        if (day.equals("Понедельник") || day.equals("понедельник")) {
            System.out.println("1");
        } else  if (day.equals("Вторник") || day.equals("вторник")) {
            System.out.println("2");
        } else  if (day.equals("Среда") || day.equals("среда")) {
            System.out.println("3");
        } else  if (day.equals("Четверг") || day.equals("четверг")) {
            System.out.println("4");
        } else  if (day.equals("Пятница") || day.equals("пятница")) {
            System.out.println("5");
        } else  if (day.equals("Суббота") || day.equals("суббота")) {
            System.out.println("6");
        } else  if (day.equals("Воскресенье") || day.equals("воскресенье")) {
            System.out.println("7");
        } else {
            System.out.println("Что-то не то");
        }
        System.out.flush();
    }
}
