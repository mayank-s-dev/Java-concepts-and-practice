package Classes.GenericClass.BoundedClass;

public class UpperBound <T extends Number>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
