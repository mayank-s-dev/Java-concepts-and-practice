package Interface.Java8andJava9Features.StaticMethod;

public interface Bird {
    static boolean canBreathe(){
        return true;
    }
}

class Eagle implements Bird{
    public void dummyMethod(){
        // can access static method
        if(Bird.canBreathe()){
            System.out.println("accessing static method by interface name");
        }

        // cannot override canBreathe method in this class
    }
}
