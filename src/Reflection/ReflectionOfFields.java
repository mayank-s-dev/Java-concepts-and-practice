package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionOfFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class eagleClass = Eagle.class;

        // get all the fields of a class
        Field[] fields = eagleClass.getFields();
        for (Field field: fields){
            System.out.println(field.getName() + " " + field.getType() + " " + Modifier.toString(eagleClass.getModifiers()));
        }

        // changing public field of an eagle object
        Eagle eagleObj = new Eagle();
        Field field = eagleClass.getField("breed");
        field.set(eagleObj, "EagleValueSet");
        System.out.println("Changed public variable in eagle class, " + eagleObj.breed);

        // changing private field of an eagle object
        Field privateField = eagleClass.getDeclaredField("colour");

        // Set the field accessible to bypass the private access modifier
        privateField.setAccessible(true);
        privateField.set(eagleObj, "Black");

        System.out.println("Changed private variable in eagle class, " + (String) privateField.get(eagleObj));



    }
}
