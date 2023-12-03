package timus.task_1877;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code_1 = in.nextInt();
        int code_2 = in.nextInt();

        if (code_1 % 2 == 0 || code_2 % 2 !=0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
