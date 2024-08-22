package Interface.DemoExample;

public class ECommerceApplication {

    private final PaymentGateway paymentGateway;

    public ECommerceApplication(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        paymentGateway.processPayment(amount);
    }

    public static void main(String[] args) {
        /*
        Just to understand, PayPal is the system which implemented payment gateway which has logic
        for process payment
        we don't know how,
        but when we want to call the process payment using payment gateway interface
         */
        // Use PayPal for payment
        PaymentGateway paypal = new PayPal();
        ECommerceApplication app1 = new ECommerceApplication(paypal);
        app1.checkout(100.0);

        // Switch to Stripe for payment
        PaymentGateway stripe = new Stripe();
        ECommerceApplication app2 = new ECommerceApplication(stripe);
        app2.checkout(200.0);
    }
}
