package laba1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Давайте определим год вашего рождения, для этого нужно ввести ваш возраст: ");
        int number = in.nextInt();
        int age = (2023 - number);
        System.out.printf("%d", age);
        in.close();
    }
}
