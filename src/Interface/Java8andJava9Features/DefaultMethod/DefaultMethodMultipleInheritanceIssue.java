package Interface.Java8andJava9Features.DefaultMethod;

interface A1{
    default void dummyMethod(){
        // some logic
    }
}

interface B1{
    default void dummyMethod(){
        // some logic
    }
}

/*
    In java 8 to achieve multiple inheritance, in case when interface A1, and interface B1
    have same methods, then class implementing them both, so class needs to provide implementation
    for that default method
 */
public class DefaultMethodMultipleInheritanceIssue implements A1, B1 {
    @Override
    public void dummyMethod() {
        // Some logic

    }
}
