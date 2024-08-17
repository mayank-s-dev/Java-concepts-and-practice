package Methods.PackageB;

import Methods.PackageA.ClassA;

public class ClassB extends ClassA{
    public void dummyMethod(){
        ClassA classA = new ClassA();
        classA.publicMethod();
        // subclass mein without object bananye call hojata hai
        protectedMethod();

        // cannot be called

        // classA.defaultMethod();
        // classA.privateMethod();
    }
}

