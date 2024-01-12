package laba6.example1;

public class Main {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        myClass1.setCh1OrStr1('a');
        myClass1.setCh1OrStr1("String");

        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);


        char[] chars1 = new char[5];

        chars1[0] = 'C';
        chars1[1] = 'h';
        chars1[2] = 'a';
        chars1[3] = 'r';
        chars1[4] = 's';

        myClass1.setCh1OrStr1(chars1);
        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        char[] chars2 = new char[1];

        chars2[0] = 'Ц';
        myClass1.setCh1OrStr1(chars2);

        System.out.println(myClass1.ch1);

    }
}
