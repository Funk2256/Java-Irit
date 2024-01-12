package laba6;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        arrayInt[0] = 10;
        arrayInt[1] = 10;
        arrayInt[2] = 10;
        arrayInt[3] = 10;
        arrayInt[4] = 10;

        System.out.println("Получаем среднее значение: " + Arrays.toString(Example3.TestClass.getMiddleInt(arrayInt)));

    }

    public static int[] getMiddleInt(int[] arrayInt){
        int sum;
        sum = Arrays.stream(arrayInt).sum();
        int [] midlearrays = new int [1];
        midlearrays[0] = sum/arrayInt.length;


        return midlearrays;
    }
}
