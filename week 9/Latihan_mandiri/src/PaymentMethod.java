// PaymentMethod.java
abstract class PaymentMethod {
    public abstract void processPayment(double amount);
    public abstract void processPayment(double amount, String currency);
}