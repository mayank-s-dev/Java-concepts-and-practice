package Classes.NestedClass.StaticNestedClass;

import Classes.NestedClass.StaticNestedClass.OuterClass;

public class Main {
    public static void main(String args[]){
        OuterClass outerClass = new OuterClass();
        OuterClass.NestedClass nestedClassObj = new OuterClass.NestedClass();
        nestedClassObj.print();
    }
}
