package laba7.example4;

public class Main {
    public static void main(String[] args) {
        ClassA charss =  new ClassA('A');
        System.out.println("==============================");
        System.out.println("Return chars: " + charss.getChars());
        ClassA charscopy = new ClassA('X');
        System.out.println(charscopy.toString());
        System.out.println(charss == charscopy);
        System.out.println("==============================");

        ClassB charsAndStr = new ClassB('B', "Strings_One");
        System.out.println("\n" + "Return chars and strings: " + charsAndStr.getChars());
        System.out.println(charsAndStr.getStrings());
        ClassB copyClassB = new ClassB('Y', "Strings_One_Copy");
        System.out.println("\n" + copyClassB.toString());
        System.out.println(charsAndStr == copyClassB);
        System.out.println("==============================");


        ClassC charsAndStrAndInt = new ClassC('C', "Strings_Two", 15);
        System.out.println( "\n" + "Return chars and strings and integers: " + charsAndStrAndInt.getChars());
        System.out.println(charsAndStrAndInt.getStrings());
        System.out.println(charsAndStrAndInt.getIntegrs());
        ClassC copyClassC = new ClassC('Z', "Strings_Two_Copy", 200);
        System.out.println("\n" + copyClassC.toString());
        System.out.println(charsAndStrAndInt == copyClassC);
        System.out.println("==============================");


    }
}


//4. Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания копии.