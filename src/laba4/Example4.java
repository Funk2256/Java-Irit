package laba4;

public class Example4 {
    public static void main(String[] args) {
        int height = 10;
        int [][] graph = new int [height][];


        for (int i=0;i<graph.length;i++){//резервирование памяти для второго измерения массива
            int j = i+1;
            graph[i]=new int[j];
        }


        for (int i = 0; i<=height; i++) {
            // Распределение пространства
            for (int j =1; j<=height-i; j++) {
                System.out.print(" ");
            }
            // Распределение символов
            for (int k = 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
