package Basics;

public class DataTypes {
    static byte exClassMemberVariable;

    public static void dummyMethod(){
        System.out.println("byte default " + exClassMemberVariable);
    }
    public static void main(String[] args){
        char c = 'a';
        char x = 97;
        // this will print 'a'
        System.out.println("char " + c);

        // this will print 'a', because it will automatically take the ASCII of character
        System.out.println(x);

        byte b = 100;
        DataTypes.dummyMethod();
        System.out.println("byte: " + b);

        short s = 100;
        int i = 200;
        long l = 300;
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        float f1 = 9.50f;
        float f2 = 10.60f;
        float f3 = f2 - f1;
        System.out.println("float: " + f3);

    }
}
