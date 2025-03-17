package Strategy;

public class CreditCard {

    private int amount = 1000;
    private final String number;
    private final String date;
    private final String cvv;

    // Constructor that initializes the final fields
    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    // Getter and Setter for amount
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CreditCard [number=" + number + ", date=" + date + ", cvv=" + cvv + ", amount=" + amount + "]";
    }
}


