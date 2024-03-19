package laba7.example3;

class SubsubClassTest3 extends SubClassTest3 {
    //Открытое текстовое поле
    public String strings;

    //Конструктор
    public SubsubClassTest3(int integers, char chars, String strings) {
        super(integers, chars);
        this.strings = strings;
    }

    //Метод
    public void setCharAndIntegerandString(char chars, int integers, String strings) {
        this.chars = chars;
        this.integers = integers;
        this.strings = strings;

    }

    public String toString() {
        return "Type class: " + "sub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "Integer: " + super.integers + "\n" +
                "Char: " + super.chars + "\n" +
                "String: " + this.strings;
    }

    //Методы get для проверки
//    public String getStrings() {
//        return strings;
//    }
//
//    public char getChar() {
//        return chars;
//    }
//
//    public int getInteger() {
//        return integers;
//    }
}


//В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта.
