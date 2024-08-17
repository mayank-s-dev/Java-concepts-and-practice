package Methods.PrivateConstructor;

public class PrivateConstructor {
    private PrivateConstructor(){
        // will do something
    }

    public static PrivateConstructor getInstance(){
        return new PrivateConstructor();
    }

    public void hello(){
        // will do something
    }
}
