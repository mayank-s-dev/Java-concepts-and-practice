package Methods;

import Methods.PackageA.ClassA;

public class Main {

    public static void main(String args[]){
        ClassA classA = new ClassA();
        classA.publicMethod();

        // CANNOT BE CALLED
        // classA.protectedMethod();
        // classA.defaultMethod();
        // classA.private();
    }
}
