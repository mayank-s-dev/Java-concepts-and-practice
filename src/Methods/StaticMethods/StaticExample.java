package Methods.StaticMethods;

public class StaticExample {
    int a = 10;
    static int b = 20;

    public static void dummyMethod(){
        System.out.println("b " + b);
        // System.out.println("a " + a); // cannot access instance varible because it is associated with
        // object not class, class can have multiple object and there will be multiple 'a' for each
        // object which 'a' we will consider, that's why we can't access it.

        // instance methods are also not called.
        // helper();
    }

    public void helper(){
        // do something
    }

    public static void main(String args[]){
        // not overridden, but hidden
        Doctor.profession();
        Person.profession();

        // practice example 2
        Calculation c1 = new Calculation();
        Calculation c2 = new Calculation();

        System.out.println(c1.sum2(10, 20));
        System.out.println(Calculation.carPrice); // carPrice got changed
        System.out.println(c2.sum2(100, 200)); // we were expecting this to be 340 but got 370
                                                        // because of c1.sum2(10, 20)
    }
}
