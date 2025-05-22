public class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of " + amount + " IDR");
    }
    
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing bank transfer payment of " + amount + " " + currency);
    }
}