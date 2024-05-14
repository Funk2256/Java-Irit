package laba11.Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println("Массив рандомных чисел : ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumber(arr, num);

        System.out.println("Список чисел больше числа " + num + " :" );
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterEvenNumber(int[] arr, Integer num) {
        return Arrays.stream(arr).filter(x-> x > num).toArray();
    }
}
//Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//содержащий только те числа, которые больше заданного значения.