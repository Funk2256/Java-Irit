package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int number_of_cans = a + b - 1;

        int harry = number_of_cans - a;
        int larry = number_of_cans - b;

        out.println(harry + " " + larry);
        out.flush();
    }
}
