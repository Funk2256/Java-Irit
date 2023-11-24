package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String firstname = in.nextLine();

        System.out.println("Введите вашу фамилию: ");
        String lastname = in.nextLine();

        System.out.println("Введите ваше отчество: ");
        String surname = in.nextLine();

        System.out.printf("Имя: %s\nФамилия: %s\nОтчество: %s\n", firstname, lastname, surname);
        in.close();

    }
}
