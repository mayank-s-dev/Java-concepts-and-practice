package Classes.NestedClass.NonStaticMemberClass;


public class Main {
    public static void main(String args[]){
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClassObj = outerClass.new InnerClass();
        innerClassObj.print();
    }
}
