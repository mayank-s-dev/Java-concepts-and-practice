package Interface.MultipleInheritance;

/*
this gives error, because multiple inehritance is not allowed
public class DiamondProblem extends ClassA, ClassB{

}
*/

//Solution for the diamond problem using interface

public class DiamondProblem implements InterfaceA, InterfaceB{

    @Override
    public void dummyMethod() {
        System.out.println("This is dummy method of class Diamond problem solution, achieved multiple inheritannce");
    }
}
