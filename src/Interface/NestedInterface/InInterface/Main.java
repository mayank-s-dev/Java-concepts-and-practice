package Interface.NestedInterface.InInterface;

public class Main {
    public static void main(String args[]){
        Eagle_One eagleOneObj = new Eagle_One();
        eagleOneObj.canRun();

        // interface can hold an object
        Bird.nonFlyingBird eagleOneObj1 = new Eagle_One();
        eagleOneObj1.canRun();

        Eagle eagleObj = new Eagle();
        eagleObj.canFly();

        Bird eagleObj1 = new Eagle();
        eagleObj1.canFly();
    }
}
