package Oops;

public class Polymorphism {
    public static void main(String[] args){
        Calculation calculation = new Calculation();
        // method overloading
        System.out.println(calculation.doSum(1, 2));
        System.out.println(calculation.doSum(3, 4,5));
        System.out.println(calculation.doSum("A", "B"));

        // method overriding
        CalculationOveriding1 calculationOveriding1 = new CalculationOveriding1();
        CalculationOveriding2 calculationOveriding2 = new CalculationOveriding2();
        System.out.println(calculationOveriding1.doMultiple(2, 3));
        System.out.println(calculationOveriding2.doMultiple(2, 3));

    }

}

class Calculation {
    int doSum(int a, int b){
        return a + b;
    }

    int doSum(int a, int b, int c){
        return a + b + c;
    }

    String doSum(String a, String b){
        return a + b;
    }
}

class CalculationOveriding1 {
    int doMultiple(int a, int b){
        return (a * b) + 1;
    }
}

class CalculationOveriding2 extends CalculationOveriding1 {
    int doMultiple(int a, int b){
        return (a * b) + 2;
    }
}