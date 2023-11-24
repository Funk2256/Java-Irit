package laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        int age = 2023 - year;
        System.out.println("Ваш возраст " + age);
        in.close();
    }
}
