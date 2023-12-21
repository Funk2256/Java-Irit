package laba4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int string = 10;
        int column = 10;
        int[][] array = new int[column][string];

        for (int i = 0; i < array.length; i++) {                            //Заполнение массива случайными числами
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");  //вывод в консоль
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int deleteS = random.nextInt(string-1);                                  //генерация № строки для удаления
        int deleteK = random.nextInt(column-1);

        int secondArray[][] = new int[string-1][column-1]; // создание массива в котором удалена 1 строка и 1 столбец
        for (int i=0, s = 0; i<string-1; s++) {
            if (s != deleteS) {
                for (int j = 0, k = 0; j < column - 1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = array[s][k];
                        System.out.print(secondArray[i][j] + " ");
                        j++;
                    }
                }
                i++;
            }
            System.out.println();
        }
    }
}
