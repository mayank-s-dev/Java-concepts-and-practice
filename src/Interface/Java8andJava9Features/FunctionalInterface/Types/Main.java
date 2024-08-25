package Interface.Java8andJava9Features.FunctionalInterface.Types;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String args[]){
        // Consumer functional interface
        Consumer<Integer> loggingObject = (Integer inputParam) -> {
            if (inputParam > 10){
                System.out.println("Consumer functional interface");
            }
        };

        loggingObject.accept(20);

        // Supplier functional interface
        Supplier<String> supplierObj = () ->{
            return "Supplier functional interface";
        };

        String res = supplierObj.get();
        System.out.println(res);

        // Function
        Function<Integer, String> integerToString = (Integer num) -> {
            String result = num.toString();
            return result;
        };
        String s = integerToString.apply(10);
        System.out.println("Function functional interface " + s);

        // Predicate
        Predicate<Integer> voterCheckPredicate = (Integer age) -> {
            // returns boolean
            System.out.println("Predicate functional interface");
            return age > 18;
        };

        voterCheckPredicate.test(50);

    }
}
