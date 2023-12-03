package laba2;

import javax.swing.*;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        if (number % 3 != 0)
            System.out.println("Не кратно 3");
        else
            System.out.println("Кратно 3");

    }
}
