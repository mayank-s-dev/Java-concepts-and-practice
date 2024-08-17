package Basics;

public class KindOfVariables {
    int memberVariable;         // member variable
    static int staticVariable;      // static variable

    // default constructor
    KindOfVariables(){}

    // parametrized constructor
    KindOfVariables(int a){}
    public void dummyMethod(){
        // local variable
        byte localVariable = 10;
        System.out.println(localVariable);
    }

    // method parameters
    public int dummyMethod(int a, int b){
        return a + b;
    }
}
