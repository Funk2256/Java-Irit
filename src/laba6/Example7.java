package laba6;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        //Создаем массив символов
        char [] charsArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] intArrays = charArtoCode(charsArray);

        System.out.println(Arrays.toString(charsArray));
        System.out.println(Arrays.toString(intArrays));
    }

    public static int[] charArtoCode(char[] charsArray) {
        int[] intArray = new int[charsArray.length];
        for (int i = 0; i < charsArray.length; i++) {
            intArray[i] = (int) charsArray[i];
        }
        return intArray;
        }
    
}
