package Lab.InterfacesAndAbstraction.PaymentServiceAPI;

public class CreditCardPayment implements Payable{


    @Override
    public void pay(double price) {
        System.out.printf("Sum %.2f is payed by credit card!\n", price);
    }
}
