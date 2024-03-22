package laba7.example4;

public class ClassB extends ClassA{
    public String strings;

    public ClassB(char charsOne, String strings) {
        super(charsOne);
        this.strings = strings;
    }

    public String getStrings() {
        return strings;
    }

    public ClassB copyClassB(char chars, String strings) {
        ClassB copyClassB = new ClassB(chars, strings);
        copyClassB.chars = super.chars;
        return copyClassB;
    }
    @Override
    public String toString() {
        return "ClassB {" + "Chars-copy: " + this.getChars() + "}" +
                "\n" + "ClassB {" + "Strings-copy: " + this.getStrings() + "}";
    }

}
