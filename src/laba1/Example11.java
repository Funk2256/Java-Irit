package laba1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите год вашего рождения: ");
        int year = in.nextInt();

        int age = (2023 - year);
        System.out.printf("%s\n%d", name, age);
        in.close();
    }
}
