package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Давайте узнаем количество требуемого сульфида для Энни");
        int sulfid,a,b,n;
        System.out.println("Введите количество панелей: ");
        n = in.nextInt();
        System.out.println("Введите размер панели 1 ");
        a = in.nextInt();
        System.out.println("Введите размер панели 2 ");
        b = in.nextInt();
        sulfid = n*(a * b)*2;
        System.out.println("Количество сульфида - " + sulfid);
    }
}
