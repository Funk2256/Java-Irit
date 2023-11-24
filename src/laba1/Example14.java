package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int user_number = in.nextInt();
        int result1 = (user_number - 1);
        int result2 = (user_number + 1);
        int square = (result1 + result2 + user_number)*2;
        System.out.printf("Число1: %d, Число2: %d, Число3: %d, Квадрат суммы: %d", result1, user_number, result2, square);
        in.close();
    }
}
