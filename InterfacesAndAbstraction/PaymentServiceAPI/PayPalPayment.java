package Lab.InterfacesAndAbstraction.PaymentServiceAPI;

public class PayPalPayment implements Payable{
    @Override
    public void pay(double price) {
        System.out.printf("Sum %.2f is payed by PayPal!\n", price);
    }
}
