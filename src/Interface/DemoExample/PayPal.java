package Interface.DemoExample;

public class PayPal implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        // PayPal-specific implementation
        System.out.println("Processing payment of $" + amount + " through PayPal.");
        // Internal details like connecting to PayPal's API, handling response, etc.
    }
}

