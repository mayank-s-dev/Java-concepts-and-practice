package Classes.NestedClass.Inheritance;

public class OuterClass {
    int instanceVariable = 10;
    static int staticVariable = 20;

    class InnerClass1 {
        int innerClassVariable1 = 30;
        void displayClass1(){
            System.out.println(innerClassVariable1 + " " +  instanceVariable + " " +  staticVariable);
        }
    }

    class InnerClass2 extends InnerClass1 {
        int innerClassVariable2 = 40;

        void displayClass2(){
            System.out.println(innerClassVariable1 + " " + innerClassVariable2 + " " +  instanceVariable + " " + staticVariable);
        }
    }
}
