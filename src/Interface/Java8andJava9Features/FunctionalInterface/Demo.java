package Interface.Java8andJava9Features.FunctionalInterface;

@FunctionalInterface
public interface Demo {
    public void dummyMethod();

    default void dummyMethodOne(){
        // will do something
    }

    static void dummyMethodTwo(){
        // will do something
    }

    // Object class method, no need to define the definition in class which implements this interface
    public String toString();
}

/*
    ways to implement functional interface
    1. Using implement keyword (Class B)
    2. using anonymous class (Class C)
    3. using lambda expression (Class D)
 */
class B implements Demo{

    @Override
    public void dummyMethod() {

    }
}

class C {
    public static void main(String args[]){
        Demo demo = new Demo(){
            @Override
            public void dummyMethod() {
                System.out.println("Dummy method with anonymous class");
                // some logic of dummy method
            }
        };

        demo.dummyMethod();
        demo.dummyMethodOne();

        // static method
        Demo.dummyMethodTwo();
    }
}

class D{
    public static void main(String args[]){

        Demo demo = () -> {
            // some logic of dummy method
            System.out.println("Dummy method with lambda expression class");

            // this is the only method of functional interface
        };

        demo.dummyMethod();
        demo.dummyMethodOne();

        // static method
        Demo.dummyMethodTwo();
    }
}