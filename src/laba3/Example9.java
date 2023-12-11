package laba3;


import java.util.Arrays;
import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int length = 10;
        int[] nums = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));

        int min = Arrays.stream(nums)
                .min()
                .orElseThrow();
        System.out.println("Минимальное значение " + min);


        for (int i = 0; i < length; i++) {
            int key = Arrays.binarySearch(nums, min);
            System.out.println("Индекс минимального значения " + key);


        }
    }
}
