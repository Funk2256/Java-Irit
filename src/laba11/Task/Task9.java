package laba11.Task;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String string = "Но многие известные личности освещают чрезвычайно интересные особенности картины в целом, " +
                "однако конкретные выводы, разумеется, заблокированы в рамках своих собственных рациональных ограничений. " +
                "Имеется спорная точка зрения, гласящая примерно следующее: " +
                "диаграммы связей будут смешаны с не уникальными данными до степени совершенной неузнаваемости, " +
                "из-за чего возрастает их статус бесполезности. " +
                "Картельные сговоры не допускают ситуации, при которой диаграммы связей, " +
                "вне зависимости от их уровня, должны быть объективно рассмотрены соответствующими инстанциями." +
                "14" +
                "05" +
                "2023";

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
        return list.stream().filter(s -> s.equals(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ ]", ""))).collect(Collectors.toList());
    }
}

//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые содержат только буквы (без цифр и символов).