package laba6;

public class Example2 {
    public static void main(String[] args) {
        int fullcount = 10;
        for (int i = 0; i <= fullcount; i++){
            My_class.getInteger();
        }
    }
    static class My_class {
        //закрытое целочисленное поле c начальным нулевым значением.
        private static int count;

    public static void getInteger() {
        count++;
        System.out.println("Счетчик " + count);
    }


    }
}
