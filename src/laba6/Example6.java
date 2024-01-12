package laba6;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {

        int[] arrayInt = new int[3];
        arrayInt[0] = 2;
        arrayInt[1] = 10;
        arrayInt[2] = 12;

        int[] arrayIntResult1 = Example6.getArray(arrayInt,2);
        System.out.println(Arrays.toString(arrayIntResult1));

        int[] arrayIntResult2 = Example6.getArray(arrayInt,10);
        System.out.println(Arrays.toString(arrayIntResult2));

    }
    public static int[] getArray(int[] arrayInt, int value) {
        if (value > arrayInt.length) {
            return arrayInt;
        }
        int[] arrayIntResult = new int[value];
        for (int i = 0; i < value; i++) {
            arrayIntResult[i] = arrayInt[i];
        }

        return arrayIntResult;
    }

}
