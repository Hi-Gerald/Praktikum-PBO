// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> paymentMethods = new ArrayList<>();
        paymentMethods.add(new CreditCard());
        paymentMethods.add(new EWallet());
        paymentMethods.add(new BankTransfer());
        
        for (PaymentMethod pm : paymentMethods) {
            pm.processPayment(100000);  // Default currency: IDR
            pm.processPayment(100, "USD");  // Specified currency: USD
        }
    }
}