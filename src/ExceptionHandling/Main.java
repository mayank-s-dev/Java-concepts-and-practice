package ExceptionHandling;

public class Main {
    public static void main(String[] args){
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        int b =  5/0;
    }

}
