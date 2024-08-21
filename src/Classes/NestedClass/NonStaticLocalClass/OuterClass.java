package Classes.NestedClass.NonStaticLocalClass;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    public void display(){
        int methodVariable = 30;
        class LocalInnerClass{
            int localInnerVariable = 40;
            public void print(){
                System.out.println(instanceVariable + " " + classVariable + " " + methodVariable + " " + localInnerVariable);
            }
        }

        LocalInnerClass localInnerClassObj = new LocalInnerClass();
        localInnerClassObj.print();
    }
}
