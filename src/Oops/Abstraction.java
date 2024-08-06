package Oops;

// from user perspective this is visible
interface Car{
    public void applyBreak();
}

// internal implementation
public class Abstraction implements Car {
    @Override
    public void applyBreak() {

    }
}
