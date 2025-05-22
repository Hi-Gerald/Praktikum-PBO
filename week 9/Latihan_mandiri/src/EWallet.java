// EWallet.java
class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing e-wallet payment of " + amount + " IDR");
    }
    
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing e-wallet payment of " + amount + " " + currency);
    }
}