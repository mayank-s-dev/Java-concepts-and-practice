package Methods.StaticMethods;

public class Calculation {
    static int carPrice = 40;

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum2(int a, int b){
        int total = a + b;
        carPrice = carPrice + total;
        return carPrice;
    }
}
