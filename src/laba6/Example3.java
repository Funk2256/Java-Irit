package laba6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example3 {
    public static void main(String[] args) {

        int[] arrayInt = new int[3];
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;

        System.out.println("Массив: " + Arrays.toString(arrayInt));
        System.out.println("Получаем наибольшее значение: " + Arrays.toString(TestClass.getMax(arrayInt)));
        System.out.println("Получаем наименьшее значение: " + Arrays.toString(TestClass.getMin(arrayInt)));
        System.out.println("Получаем среднее значение: " + Arrays.toString(TestClass.getMiddleInt(arrayInt)));

    }

    static class TestClass {
        public static int[] getMax(int[] arrayInt) {
            Arrays.sort(arrayInt);
            int [] newArrayInt = new int[1];
            newArrayInt[0] = arrayInt[arrayInt.length -1];

            return newArrayInt;
        }

        public static int[] getMin(int[] arrayInt) {
            Arrays.sort(arrayInt);
            int [] minArrayInt = new int[1];
            minArrayInt[0] = arrayInt[0];

            return minArrayInt;
        }

        public static int[] getMiddleInt(int[] arrayInt){
            int sum;
            sum = Arrays.stream(arrayInt).sum();
            int [] midlearrays = new int [1];
            midlearrays[0] = sum/arrayInt.length;


            return midlearrays;
        }
        }
    }

