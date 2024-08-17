package Methods.Super;

public class Manager1 extends Person1{
    int age;
    Manager1(int age, int empId){
        super(empId);
        System.out.println("Manager 1 constructor invoked");
        this.age = age;
    }
}
