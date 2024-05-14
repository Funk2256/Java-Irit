package laba11.Task;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterCopitalizedStrings(strings);

        System.out.println("\nСтрока после преобразования: \n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterCopitalizedStrings(List<String> list) {
        return list.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}

//        Напишите функцию, которая принимает на вход список строк и
//возвращает новый список,
//содержащий только те строки, которые начинаются с большой буквы.