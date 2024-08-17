package Classes.NestedClass.PrivateStaticNestedClass;


public class Main {
    public static void main(String args[]){
        // cannot access because NestedClass in now private
        // OuterClass.NestedClass

        OuterClass outerClass = new OuterClass();
        outerClass.display();

    }
}