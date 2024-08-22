package Interface.Java8andJava9Features.DefaultMethod;

public class Main {
    public static void main(String args[]){
        /* Default method basic */
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.dummyMethod();
        defaultMethod.helperMethod();

        DefaultMethod_one defaultMethod_one = new DefaultMethod_one();
        defaultMethod_one.dummyMethod();
        defaultMethod_one.helperMethod();

        /* Interface Extend */

        Eagle eagle = new Eagle();
        eagle.canBreathe();

        Eagle_One eagleOne = new Eagle_One();
        eagleOne.canBreathe();
    }
}
