package Interface;


/*
Access modifiers: default, public
 */

// public interface
public interface InterfaceBasics {
    public static final int MAX_HEIGHT = 10;

    int MAX_HEIGHT_ONE = 20;

    /*
        1. hello() and hello_one() both are public by default
        2. MAX_HEIGHT and MAX_HEIGHT_ONE both are public, final, static
            because in interface this is implicit for fields
     */
    public void hello();
    void hello_one();

    /*

     */
}

// default interface
interface Interface {

}

interface Bird {
    public void fly();
}

interface LivingThings{
    public void canRun();
}

// only extend interface
interface NonFlyingBirds extends Bird, LivingThings{

}