package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String mouth = in.nextLine();

        System.out.println("Введите день недели: ");
        String day = in.nextLine();

        System.out.println("Введите сегодняшнее число");
        int num = in.nextInt();

        System.out.printf("%s\n%d\n%s",day,num,mouth);
        in.close();
    }
}
