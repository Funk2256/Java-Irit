package laba3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Введите количество символов до 10: ");
        String[] chars = new String [] {"а", "c", "e", "g", "i", "k", "m", "o", "q", "s"};
        int size = in.nextInt();
        if (size <= 10) {
            int[] ints = new int[size];
            System.out.println("Массив в прямом порядке: ");
            for (int i = 0; i < ints.length; i++) {
                System.out.println(chars[i]);
            }
            System.out.println("Массив в обратном порядке: ");
            for (int i = ints.length - 1; i >= 0; i--) {
                System.out.println(chars[i]);
            }
        } else {
            System.out.println("Что-то не так");
        }
    }
}
