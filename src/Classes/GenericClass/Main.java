package Classes.GenericClass;

import Classes.GenericClass.BoundedClass.A;
import Classes.GenericClass.BoundedClass.B;
import Classes.GenericClass.BoundedClass.MultiBound;
import Classes.GenericClass.BoundedClass.UpperBound;

import java.math.BigInteger;

public class Main {
    public static void main(String args[]){
        CurrentProblem currentProblem = new CurrentProblem();
        currentProblem.setVal(10);
        Object currVal = currentProblem.getVal();

        // # typecasting needs to be done
        if((int)currVal == 10){
            System.out.println("Current problem is we need to typecast");
        }

        // # generic class solution
        GenericClassSolution<Integer> genericClassSolution = new GenericClassSolution<Integer>();
        genericClassSolution.setVal(10);
        Integer currVal1 = genericClassSolution.getVal();
        if(currVal1 == 10){
            System.out.println("No typecasting with generic class");
        }

        // # multiple genetic type
        MutlipleGenericType<String, Integer> mutlipleGenericType = new MutlipleGenericType<>();

        // this is also correct syntax: MutlipleGenericType<String, Integer> mutlipleGenericType = new MutlipleGenericType<String, Integer>();

        mutlipleGenericType.put("Hello", 2322);


        // # generic method
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.genericMethodDemo(10);
        genericMethod.genericMethodDemo("Hello");

        // # bounded generic class
        UpperBound<Integer> upperBoundGenericObj = new UpperBound<Integer>();
        // cannot create such object
        // UpperBound<String> upperBoundGenericObj1 = new UpperBound<String>();

        UpperBound<Number> upperBoundGenericObj2 = new UpperBound<Number>();
        UpperBound<Float> upperBoundGenericObj3 = new UpperBound<Float>();
        UpperBound<BigInteger> upperBoundGenericObj4 = new UpperBound<BigInteger>();

        // # multi bound

        A obj = new A();
        B objB = new B();
        MultiBound<A> multiBoundObjA = new MultiBound<A>();
        // cannot use B, because B don't implement Interface2
        // MultiBound<B> multiBoundObjB = new MultiBound<B>();

    }
}
