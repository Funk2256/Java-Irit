package laba4;

public class Example1 {
    public static void main(String[] args) {
        int i, j;
        int height = 23;
        int width = 100;
        System.out.println("Rectangle " + height + "x" + width + ":");
        for (i = 0; i < height; ++i, System.out.println())
            for (j = 0; j < width; ++j)
                System.out.print("X");
    }
}
