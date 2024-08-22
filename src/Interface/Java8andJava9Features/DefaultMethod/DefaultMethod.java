package Interface.Java8andJava9Features.DefaultMethod;

interface A {
    public void dummyMethod();

    default void helperMethod(){
        // this method is common for all subclasses implementing this interface
        System.out.println("helperMethod in A interface class");
    }
}
public class DefaultMethod implements A{
    @Override
    public void dummyMethod() {
        // some logic
        System.out.println("dummyMethod in default method class");
    }

    @Override
    public void helperMethod() {
        // we can override the default helper method
        System.out.println("Helper in default method class");
    }
}

class DefaultMethod_one implements A{

    @Override
    public void dummyMethod() {
        // some other logic
        System.out.println("dummyMethod in DefaultMethod_one class");
    }
}
