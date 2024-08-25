package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionOfMethods {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class eagleClass = Eagle.class;

        // all public methods of class and it's parent class
        for (Method method: eagleClass.getMethods()){
            System.out.println(method.getName() + " " + method.getReturnType() + " " + method.getDeclaringClass());
            System.out.println("$$$$$$$");
        }

        // all private and public methods of class
        for (Method method: eagleClass.getDeclaredMethods()){
            System.out.println(method.getName() + " " + method.getReturnType() + " " + method.getDeclaringClass());
            System.out.println("#####");
        }

        /*
            Invoke methods using reflections
         */

        // 1. create object of that class
        Object eagleObject = eagleClass.newInstance();

        // 2. Fetch that method
        Method flyMethod = eagleObject.getClass().getMethod("fly", int.class, boolean.class, String.class);

        // 3. call that method
        flyMethod.invoke(eagleObject, 10, true, "Mayank");
    }
}
