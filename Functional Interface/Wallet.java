public class Wallet implements DigitalPayment {
    @Override
    public void pay() {
        System.out.println("Payment made via Wallet");
    }
}
