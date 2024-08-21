package Classes.NestedClass.Inheritance;


public class Main {
    public static void main(String args[]){
        OuterClass outerClass = new OuterClass();
        outerClass.instanceVariable = 100;

        // for understand consider innerClass1Obj and innerClass2Obj as two instance variable of class
        // which further have their instance variable
        OuterClass.InnerClass1 innerClass1Obj = outerClass.new InnerClass1();
        innerClass1Obj.innerClassVariable1 = 80;

        OuterClass.InnerClass2 innerClass2Obj = outerClass.new InnerClass2();
        innerClass2Obj.displayClass1(); // display 30 100 20

        innerClass1Obj.displayClass1(); // display 80 100 20
        // above results are different: we modified the instance of innerClass1Obj
//        innerClass2Obj.displayClass2();



    }
}
