package laba7.example3;

class SubClassTest3 extends SuperClassTest3 {
    //Открытое символьное поле
    public char chars;
//Конструктор с 2мя параметрами
    public SubClassTest3(int integers, char chars) {
        super(integers);
        this.chars = chars;
    }
//Метод с 2мя параметрами, для присваивания значения полям.
    public void setIntegers(char chars, int integers) {
        this.chars = chars;
        this.integers = integers;
    }

    @Override
    public String toString() {
        return "Type class: " + "sub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "Integer: " + super.integers + "\n" +
                "Char: " + this.chars + "\n";
    }


//Методы get для проверки
//    public char getChars() {
//        return chars;
//    }
//    public int getInteger(){
//        return integers;
//    }


}


//Во втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами.