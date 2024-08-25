package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionOfConstructor {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class dogClass = Dog.class;
        Constructor[] constructors = dogClass.getConstructors();

        for (Constructor dogConstructor: constructors){
            System.out.println("Modifier " + Modifier.toString(dogClass.getModifiers()));

            dogConstructor.setAccessible(true);

            Dog dogObj = (Dog) dogConstructor.newInstance();
            dogObj.run();
        }
    }
}
