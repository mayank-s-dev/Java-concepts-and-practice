package Methods.Super;

public class Manager extends Person{
    Manager(){
        // if there is inheritance, by default super() is there and parent class constructor is called
        System.out.println("Manager class constructor invoked");
    }
}
