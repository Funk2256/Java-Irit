package laba6;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Изначальный массив символов: " + Arrays.toString(charArray));
        revCharArray(charArray);
        System.out.println("Массив символов на выходе: " + Arrays.toString(charArray));
    }

    public static void revCharArray(char[] charArray) {
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }
    }
}
