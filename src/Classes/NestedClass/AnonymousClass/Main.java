package Classes.NestedClass.AnonymousClass;

public class Main {
    public static void main(String args[]){
        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("Audi car specific break challenges");
            }
        };
    }
}
