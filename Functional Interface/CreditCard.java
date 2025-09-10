public class CreditCard implements DigitalPayment {
    @Override
    public void pay() {
        System.out.println("Payment made via Credit Card");
    }
}
