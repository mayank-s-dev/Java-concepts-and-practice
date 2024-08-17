package Methods.PackageA;

public class ClassAOne {
    public void dummyMethods(){
        ClassA classA = new ClassA();
        classA.protectedMethod();
        classA.defaultMethod();
        classA.publicMethod();

        //cannot be called
        // classA.privateMethod();
    }
}
