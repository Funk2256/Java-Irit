package laba7.example5;

public class TwoSubClass extends SuperClass{
    private char privateChars;

    TwoSubClass(String str1, char privateChars){
        super(str1);
        this.privateChars = privateChars;;
    }

    @Override
    public String getInfo() {
        return "\n" + super.getInfo() + "\n" + "Char: " + privateChars;
    }
}
