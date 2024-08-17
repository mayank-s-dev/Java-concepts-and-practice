package Methods.ConstructorChaining;


public class Calculator {
    String name;
    int employeeId;
    Calculator(){
        this(10);
    }

    Calculator(int empId){
        this("Mayank", empId);

    }

    Calculator(String name, int empId){
        this.name = name;
        this.employeeId = empId;
    }
}
