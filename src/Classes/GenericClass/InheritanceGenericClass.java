package Classes.GenericClass;

public class InheritanceGenericClass extends GenericClassSolution<String>{
    // while inheriting type needs to be specified when subclass in not generic
}


class InheritanceGenericClass1<T> extends GenericClassSolution<T>{
    // while inheriting type needs not to be specified when subclass in generic
}