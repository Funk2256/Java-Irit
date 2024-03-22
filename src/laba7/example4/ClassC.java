package laba7.example4;

public class ClassC extends ClassB{
    public int integrs;

    public ClassC(char charsOne, String strings, int integrs) {
        super(charsOne, strings);
        this.integrs = integrs;
    }

    public int getIntegrs() {
        return integrs;
    }
    public ClassB copyClassC(char chars, String strings, int integrs) {
        ClassB copyClassC = new ClassC(chars, strings, integrs);
        copyClassC.chars = super.chars;
        copyClassC.strings = super.strings;
        return copyClassC;
    }
    @Override
    public String toString() {
        return "ClassC {" + "Chars-copy: " + this.getChars() + "}" +
                "\n" + "ClassC {" + "Strings-copy: " + this.getStrings() + "}" +
                "\n" + "ClassC {" + "Integers-copy: " + this.getIntegrs() + "}";
    }
}
