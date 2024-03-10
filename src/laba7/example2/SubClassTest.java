package laba7.example2;

public class SubClassTest extends SuperClassTest {
    public int int1;
    public SubClassTest(String str1) {
        super(str1);
    }

    public SubClassTest(String str1, int int1) {
        super(str1);
        this.int1 = int1;
    }

    @Override
    public String getStr1(){
        return super.getStr1();
    }
    @Override
    public void setStr1(String str1) {
        super.setStr1(str1);
    }
    @Override
    public void setConstValue() {
        super.setConstantValue();
    }

    @Override
    public int getStringLength() {
        return super.getStringLegth();
    }
    public int getInt1(int x) {
        return int1 + x;
    }

    public int getInt1() { return int1; }

    public void setInt1() { this.int1 =int1; }

}
