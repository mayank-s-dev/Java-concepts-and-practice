package Interface.Java8andJava9Features.StaticMethod;

public interface PrivateStaticMethod {
    void myAbstractMethod();

    public default void myDefaultMethod(){
        myPrivateMethod(); // calling private method
        myPublicStaticMethod(); // calling public static method
        myPrivateStaticMethod(); // calling private static method
    }

    private void myPrivateMethod(){
        myDefaultMethod();
        myPublicStaticMethod(); // calling public static method
        myPrivateStaticMethod(); // calling private static method
    }
    static void myPublicStaticMethod(){
        myPrivateStaticMethod(); // calling private static method
    }
    private static void myPrivateStaticMethod(){
        myPublicStaticMethod(); // calling public static method
    }
}
