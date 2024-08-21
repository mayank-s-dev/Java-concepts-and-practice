package Classes.NestedClass.NestedClassInheritanceByOtherClass;

// we are inheriting a static class
public class OtherClass extends OuterClass.NestedClass{
    public void otherDisplay(){
        System.out.println("Inside other class");
    }
}

// we are inheriting a member class
class OtherClass1 extends OuterClass.NestedClass1{
    OtherClass1() {
        // when child class constructor is invoked, it first invokes the constructor of parent
        // but here the parent is inner class, so it's constructor can be invoked/accessed by the
        // object of outerClass
        new OuterClass().super();
    }
}