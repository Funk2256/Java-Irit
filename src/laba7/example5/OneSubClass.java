package laba7.example5;

public class OneSubClass extends SuperClass{
    private int privateInteger;

   OneSubClass(String str1, int privateInteger) {
        this.privateInteger = privateInteger;
        super.setStr1(str1);
    }

    @Override
    public String showInfo(){
        return "String: " + str1 + "\n" +"Class name: " + OneSubClass.this.getClass().getName()
                + "\n" + "Integer: " + privateInteger;
    }

//    public OneSubClass(String str1, int privateInteger){
//        OneSubClass testOneSubClass = new OneSubClass(str1, privateInteger);
//        testOneSubClass.str1 = super.str1;
//        testOneSubClass.privateInteger = this.privateInteger;
//    }

}
