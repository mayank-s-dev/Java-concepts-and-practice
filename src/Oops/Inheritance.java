package Oops;

public class Inheritance {
    public static void main(String[] args){
        CarInheritance carInheritance = new CarInheritance();
        System.out.println(carInheritance.isHasEngine());
    }
}

class CarInheritance extends Vehicle {
    String carType;

    public String getCarType() {
        return this.carType;
    }

}