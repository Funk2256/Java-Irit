package laba11.Task;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        String string = "Равным образом начало повседневной работы по формированию позиции " +
                "влечет за собой процесс внедрения и модернизации системы обучения кадров, " +
                "соответствует насущным потребностям. Товарищи! реализация намеченных плановых заданий " +
                "требуют определения и уточнения системы обучения кадров, соответствует насущным потребностям. ";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for (String e : strings) {
            System.out.println(e);
        }

        String substr = "Равным";

        List<String> stringsAfter = stringfilterSearch(strings, substr);
        System.out.println("\nРезультат поиска: \n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> stringfilterSearch(List<String> list, String substr) {
        return list.stream().filter(str -> str.contains(substr)).collect(Collectors.toList());
    }
}

//Напишите функцию, которая принимает на вход
//список строк и возвращает новый список,
//содержащий только те строки, которые содержат заданную подстроку.
