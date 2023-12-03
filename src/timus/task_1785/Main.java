package timus.task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        if (n >=1 && n <= 4){
            System.out.println("few");
        } else if (n >=5 && n <= 9){
            System.out.println("few");
        }


            out.println();
            out.flush();
    }
}
