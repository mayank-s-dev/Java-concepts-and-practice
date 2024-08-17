package Methods.PrivateConstructor;

public class OtherClass {
    public void dummyMethod(){
        // you can't do this
        // PrivateConstructor privateConstructor = new PrivateConstructor();

        // this is how you will create object
        PrivateConstructor privateConstructor = PrivateConstructor.getInstance();

        // and with this object we can call instance methods
        privateConstructor.hello();
    }
}
