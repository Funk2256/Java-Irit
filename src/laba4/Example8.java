package laba4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();
        System.out.println("Введите ключ для шифрования: ");
        int key = in.nextInt();
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];


        for (int i =0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
        }

        for (int i =0; i < chars.length; i++) {
            chars[i] = (char)ints[i];
        }
        System.out.println("Текст после преобразования :" + Arrays.toString(chars));


        System.out.println("Выполнить обратное преобразование? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("y")) {
            for (int i =0; i < chars.length; i++) {
                ints[i] = chars[i] - key;
            }

            for (int i =0; i < chars.length; i++) {
                chars[i] = (char)ints[i];
            }
            String str = new String(new String(chars));
            System.out.println(str);
            /*System.out.println("Текст после преобразования :" + Arrays.toString(chars));  */
        } else if(string.equals("n")){
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

    }
}
