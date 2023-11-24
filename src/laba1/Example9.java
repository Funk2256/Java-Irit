package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String mouth = in.nextLine();

        if (mouth.equals("Январь")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Январе 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в Январе 31 день!");
            }
        }

        if (mouth.equals("Февраль")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 28 || num == 29) {
                System.out.println("Все верно, в Феврале бывает 28 и 29 дней!");
            }
            else {
                System.out.println("Вы ошиблись в Феврале другое количество дней!");
            }
        }

        if (mouth.equals("Март")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Марте 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в Марте 31 день!");
            }
        }

        if (mouth.equals("Апрель")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 30) {
                System.out.println("Все верно, в Апреле 30 дней!");
            }
            else {
                System.out.println("Вы ошиблись в Апреле 30 дней!");
            }
        }

        if (mouth.equals("Май")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Мае 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в Мае 31 день!");
            }
        }

        if (mouth.equals("Июнь")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 30) {
                System.out.println("Все верно, в Июне 30 день!");
            }
            else {
                System.out.println("Вы ошиблись в Июне 30 день!");
            }
        }

        if (mouth.equals("Июль")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Июле 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в Июле 31 день!");
            }
        }

        if (mouth.equals("Август")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Августе 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в Августе 31 день!");
            }
        }

        if (mouth.equals("Сентябрь")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 30) {
                System.out.println("Все верно, в Сентябре 30 дней!");
            }
            else {
                System.out.println("Вы ошиблись в Сентябре 30 дней!");
            }
        }

        if (mouth.equals("Октябрь")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Октябре 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в Октябре 31 день");
            }
        }

        if (mouth.equals("Ноябрь")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 30) {
                System.out.println("Все верно, в Ноябре 30 дней!");
            }
            else {
                System.out.println("Вы ошиблись в Ноябре 30 дней!");
            }
        }

        if (mouth.equals("Декабрь")) {
            System.out.println("Введите количество дней в месяце: ");
            int num = in.nextInt();
            if (num == 31) {
                System.out.println("Все верно, в Декабре 31 день!");
            }
            else {
                System.out.println("Вы ошиблись в ДекабреДекабрь 31 день");
            }
        }

        else {
            System.out.println("Проверьте название месяца!");
        }
        in.close();
    }
}
