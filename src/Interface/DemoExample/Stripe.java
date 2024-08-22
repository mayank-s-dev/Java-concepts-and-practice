package Interface.DemoExample;

public class Stripe implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        // Stripe-specific implementation
        System.out.println("Processing payment of $" + amount + " through Stripe.");
        // Internal details like connecting to Stripe's API, handling response, etc.
    }
}
