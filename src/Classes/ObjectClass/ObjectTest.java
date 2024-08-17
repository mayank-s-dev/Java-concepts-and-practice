package Classes.ObjectClass;

public class ObjectTest {
    public static void main(String args[]){
        ObjectTest objectTest = new ObjectTest();

        Object person = new Person();
        Object car = new Car();

        System.out.println(person.getClass());
        System.out.println(car.getClass());
    }
}
