package laba4;

import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int string = 10;
        int column = 10;
        int[][] array = new int[column][string];
        int[][] new_array = new int[string][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                new_array[j][i] = array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println('\n');

        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(new_array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
