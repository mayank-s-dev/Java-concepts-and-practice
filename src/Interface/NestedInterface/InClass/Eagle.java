package Interface.NestedInterface.InClass;

public class Eagle implements Bird.NonFlyingBird {
    @Override
    public void canRun() {
        System.out.println("Can run in Eagle class implementing Bird.NonFlyingBird");
    }
}
