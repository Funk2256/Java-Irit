package laba12;

import java.util.Arrays;
import java.util.Random;


public class Task5 {
    public static void main(String[] args) {
        //Определяем количество ядер процессора доступных для Java-машине
        int cores = Runtime.getRuntime().availableProcessors();
        //Создаем массив целых чисел
        int[] arrRandom = new int[1000];
        Random random = new Random();
        for (int i = 0; i<arrRandom.length; i++) {
            arrRandom[i] = random.nextInt();
        }
//        System.out.println(Arrays.toString(arrRandom));
//        System.out.println(Arrays.stream(arrRandom).max());
        int[] arrResult = maxNumber(arrRandom);
//        System.out.println(Arrays.toString(arrResult));
    }

public static int[] maxNumber(int[] arrRandom) {
    Arrays.stream(arrRandom).forEach(n -> System.out.println(n + " "));

    return arrRandom;
}
}
