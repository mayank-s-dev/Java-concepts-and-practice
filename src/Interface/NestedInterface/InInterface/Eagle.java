package Interface.NestedInterface.InInterface;

public class Eagle implements Bird{
    @Override
    public void canFly() {

    }
}

class Eagle_One implements Bird.nonFlyingBird{

    @Override
    public void canRun() {

    }
}
