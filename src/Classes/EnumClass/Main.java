package Classes.EnumClass;

public class Main {
    public static void main(String args[]){
        /* Common functions used in enums
            values()
            Ordinal()
            valueOf()
            name()
         */

        for(EnumSample enumSample: EnumSample.values()){
            System.out.println("Ordinal " + enumSample.ordinal());
            System.out.println("Name " + enumSample.name());
            /*
                System.out.println("Name " + EnumSample.valueOf("Mayank"));
                results in error
             */
        }

        System.out.println("Value of Friday " + EnumSample.valueOf("FRIDAY"));
        EnumSample enumSample1 = EnumSample.valueOf("SATURDAY");
        System.out.println("Value of Saturday " + enumSample1.name());

        System.out.println("class 1 " + enumSample1.name().getClass());
        System.out.println("class 2 " + enumSample1.getClass());

        // invoking dummy method
        enumSample1.dummyMethod();
        EnumSample.TUESDAY.dummyMethod();

        // override dummy method by Monday enum, we have multiple ways to invoke
        EnumSample.MONDAY.dummyMethod();
        EnumSample.valueOf("MONDAY").dummyMethod();

        /* Custom enums */
        EnumWithCustomValues oneOone = EnumWithCustomValues.getEnumFromValue(101);
        System.out.println("oneOone" + oneOone);
        System.out.println("oneOone" + oneOone.getComment());

        /* Abstract method enum */
        EnumAbstractSample.MONDAY.dummyAbstractMethod();
        EnumAbstractSample.TUESDAY.dummyAbstractMethod();
        EnumAbstractSample.WEDNESDAY.dummyAbstractMethod();

        /* Interface enum */
        EnumInterfaceSample enumInterfaceSample = EnumInterfaceSample.MONDAY;
        System.out.println(enumInterfaceSample.toLowerCase());
    }
}
