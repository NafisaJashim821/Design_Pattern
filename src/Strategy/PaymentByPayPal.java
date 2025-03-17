package Strategy;

public class PaymentByPayPal implements PaymentStrategy{
    private  String password;
    private String email;

    @Override
    public void collectPaymentDetails() {
        email = "PayPal Mail";
        password = "PayPal Password";
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        System.out.printf("Validating PayPal Info: %s | %s%n", email, password);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
