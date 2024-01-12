package laba6;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        int[] arrayInt = getMaxAndMinValue(10,20,30,20, 11, 14, 91, 26, 500, 2);
//        System.out.println(Arrays.toString(arrayInt));
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }
    public static int[] getMaxAndMinValue(int ... v){
        Arrays.sort(v);

        int[] arrayInt = new int[2];
        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length-1];

        return arrayInt;

    }
}
