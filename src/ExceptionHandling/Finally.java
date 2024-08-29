package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException  exceptionObject) {
            System.out.println("ClassNotFoundException is caught");
        } finally {
            System.out.println("Reaching finally block");
        }
    }

    private static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
