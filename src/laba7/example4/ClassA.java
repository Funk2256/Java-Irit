package laba7.example4;

public class ClassA {
    public char chars;

    ClassA(char charsOne){
        this.chars = charsOne;
    }

    public char getChars() {
        return chars;
    }

    public ClassA copyClassA(char chars) {
        ClassA copyClassA = new ClassA(chars);
        return copyClassA;
    }

    @Override
    public String toString() {
        return "ClassA {" + "Chars-copy: " + this.getChars() + "}";
    }
}
