package Interface;

interface Bird_One {
    public Boolean canFly();
    public int noOfLegs();
}

// CONCRETE CLASS
public class InterfaceImplementation implements Bird_One{
    @Override
    public Boolean canFly() {
        return true;
    }

    @Override
    public int noOfLegs() {
        return 2;
    }
}

// ABSTRACT CLASS: no need to define all methods

abstract class InterfaceImplementation_One implements Bird_One{
    @Override
    public Boolean canFly() {
        return true;
    }

    public abstract void anotherMethodFromAbstract();
}

// extending an abstract class
class InterfaceImplementation_Two extends InterfaceImplementation_One{
    @Override
    public int noOfLegs() {
        return 0;
    }

    @Override
    public void anotherMethodFromAbstract() {

    }
}
