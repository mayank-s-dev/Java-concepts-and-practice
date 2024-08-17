package Classes.NestedClass.StaticNestedClass;

import java.util.stream.StreamSupport;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    public static class NestedClass {
        public void print(){
            // will give error
            // System.out.println(instanceVariable);

            System.out.println(classVariable);
        }
    }
}
