package Strategy;



public class PaymentService {

    private int cost;
    private boolean includeDelivery = true;

    // Use PaymentStrategy interface here
    private PaymentStrategy strategy;

    // Setter method to accept any PaymentStrategy implementation
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

}
