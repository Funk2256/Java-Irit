package laba4;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[][] array = new int[10][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
