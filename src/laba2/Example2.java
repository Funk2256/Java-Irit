package laba2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите число");

        int numbers = in.nextInt();

        if (numbers % 5 == 2)
            System.out.println("Делится на 5 и остаток равен 2");
        else
            System.out.println("При делении на 5 остаток не равен 2");

        if (numbers % 7 == 1)
            System.out.println("Делится на 7 и остаток равен 1");
        else
            System.out.println("При делении на 7 остаток не равен 1");

    }
}
