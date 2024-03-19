package laba7.example3;

public class SuperClassTest3 {
    public int integers;
    //Конструктор
    public SuperClassTest3(int integers) {
        this.integers = integers;
    }

//Метод возвращающий значение integers
//    public int getIntegers() {
//        return integers;
//}
    public void setIntegers(int integers) {
    this.integers = integers;
}

    @Override
    public String toString() {
        return "\n" + "Type class: " + "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "Integer: " + this.integers + "\n";
    }
}

//В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром.

