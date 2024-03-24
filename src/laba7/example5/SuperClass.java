package laba7.example5;

public class SuperClass {
    private String str1;

    SuperClass(String str1){
        this.str1 = str1;
    }

    public String getInfo() {
        return "String: " + str1 + "\n" +"Class name: " +
                SuperClass.this.getClass().getName();
    }

    public void setStr1(String str1) {
        this.str1 = str1;

    }
}
