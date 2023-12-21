package laba4;

import javax.sound.midi.Soundbank;

public class Example2 {
    public static void main(String[] args) {
        int count = 15;
        for (int i = 0; i<=count; i++) {
            // Распределение пространства
            for (int j =1; j<=count-i; j++) {
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