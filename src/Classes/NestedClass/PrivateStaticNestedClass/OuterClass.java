package Classes.NestedClass.PrivateStaticNestedClass;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    private static class NestedClass {
        public void print(){
            // will give error
            // System.out.println(instanceVariable);

            System.out.println("Private Nested class triggered");
            System.out.println(classVariable);
        }
    }

    public void display(){
        NestedClass nestedClass = new NestedClass();
        nestedClass.print();
    }
}
