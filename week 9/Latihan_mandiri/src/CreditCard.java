public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount + " IDR");
    }
    
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing credit card payment of " + amount + " " + currency);
    }
}
