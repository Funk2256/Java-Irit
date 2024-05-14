package laba11.Task;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество сомволов в строке: ");
        int stringLenght = scanner.nextInt();

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterCopitalizedStrings(strings, stringLenght);

        System.out.println("\nСтрока с количеством символов больше: " + stringLenght +"\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterCopitalizedStrings(List<String> list, Integer stringLenght) {
        return list.stream().filter(s -> s.length() > stringLenght).collect(Collectors.toList());
    }

}

//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые имеют длину больше заданного значения.