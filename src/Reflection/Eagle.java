package Reflection;

public class Eagle {
    public String breed;

    private String colour;
    private boolean canSwim;

    public void fly1(){
        System.out.println("Fly");
    }

    public void eat(){
        System.out.println("Eat");
    }

    public void fly(int intParam, boolean boolParam, String strParam){
        System.out.println("Method invoked from Reflection:  " + intParam + " " + boolParam + " " + strParam);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        colour = colour;
    }
}
