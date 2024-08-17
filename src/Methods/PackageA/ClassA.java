package Methods.PackageA;

public class ClassA {
    private void privateMethod(){
        // will do something
    }

    protected void protectedMethod(){
        // will do something
    }

    void defaultMethod(){
        // will do something
    }

    public void publicMethod(){
        // private method can only be call from here
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}
