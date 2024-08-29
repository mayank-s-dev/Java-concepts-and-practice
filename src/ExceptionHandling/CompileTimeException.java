package ExceptionHandling;

public class CompileTimeException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException exceptionObject) {
            System.out.println("ClassNotFoundException is caught");
            exceptionObject.printStackTrace();
        }
    }

    // it's important to throw ClassNotFoundException from method1
    private static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
