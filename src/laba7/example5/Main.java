package laba7.example5;

public class Main {
    public static void main(String[] args) {

        SuperClass testSuperClass = new SuperClass("Test string Super Class");
        System.out.println("\n" + testSuperClass.getInfo() + "\n");

        OneSubClass testOneSubClass = new OneSubClass("null", 10);
        testOneSubClass.setStr1("Test String OneSub Class");
//        System.out.println(testOneSubClass.toString());
        System.out.println(testOneSubClass.getInfo());

        TwoSubClass testTwoSubClass = new TwoSubClass("null", 'A');
        testTwoSubClass.setStr1("Test String TwoSub Class");
        System.out.println(testTwoSubClass.getInfo());
    }
}


//        Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//отображается название класса и значение поля. На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//переопределен метод для отображения значений полей объекта и названия класса. Во
//втором подклассе появляется защищенное символьное поле, конструктор с двумя
//параметрами и переопределен метод, отображающий в консоли название класса и значения
//полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//метод через объектную переменную суперкласса, которая ссылается на объект
//производного класса.