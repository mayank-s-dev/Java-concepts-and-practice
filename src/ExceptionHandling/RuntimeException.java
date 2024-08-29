package ExceptionHandling;

public class RuntimeException {
    public static void main(String[] args){
        // 1. Runtime exceptions
//        method1();

        // 2. Class cast exception
        Object val = 0;
        System.out.println((String) val);
    }

    private static void method1() {
        throw new ArithmeticException();
    }
}
