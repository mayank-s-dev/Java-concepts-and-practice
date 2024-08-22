package Interface.Java8andJava9Features.DefaultMethod;

public class InterfaceExtend {
}

interface LivingThings{
    default boolean canBreathe(){
        System.out.println("Can breathe of LivingThings interface");
        return true;
    }
}

// way 1
interface Bird extends LivingThings {}
class Eagle implements Bird{}

// way 2
interface Bird_one extends LivingThings{
    boolean canBreathe();
}

class Eagle_One implements Bird_one{
    @Override
    public boolean canBreathe() {
        System.out.println("Can breathe of Eagle_One class ");
        return true;
    }
}

// way 3

interface BirdTwo extends LivingThings{
    default boolean canBreathe(){
        // parent interface ka can breathe bhi call kiya jaa skta hai if needed
        boolean canBreathe = LivingThings.super.canBreathe();
        return canBreathe;
    }
}

class Eagle_two implements BirdTwo{}