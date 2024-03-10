package laba7.example2;

public abstract class SuperClassTest {
    private String str1;

    public SuperClassTest(String str1) {this.str1 = str1;}

    public String getStr1() {return str1;}
    public void setStr1 (String str1) {this.str1 = str1;}
    public void setConstantValue() {this.str1 = "Присвоили константу";}

    @Override
    public String toString() {
        return "SuperClass{" +
                "str1='" + str1 + '\'' +
                '}';
    }
    public int getStringLegth() {
        if(null == this.str1){
            return 0;
        }

        return this.str1.length();
    }

    public abstract void setConstValue();

    public abstract int getStringLength();
}

