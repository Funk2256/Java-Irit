package laba6;

public class Example6 {
    public static void main(String[] args) {
    }
    public static int[] getArray(int[] arrayInt, int value) {
        if (value > arrayInt.length) {
            return arrayInt;
        }
        int[] arrayIntResult = new int[value];
        for (int i = 0; i > value; i++) {
            arrayIntResult[i] = arrayInt[i];
        }

        return arrayIntResult;
    }

}
