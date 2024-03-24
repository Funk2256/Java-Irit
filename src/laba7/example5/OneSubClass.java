package laba7.example5;

import laba7.example2.SubClassTest;

public class OneSubClass extends SuperClass{
    private int privateInteger;

   OneSubClass(String str1, int privateInteger) {
       super(str1);
       this.privateInteger = privateInteger;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +"Integer: " + privateInteger;
    }

}
