package Lab.InterfacesAndAbstraction.PaymentServiceAPI;

public class RevolutPayment implements Payable{

    @Override
    public void pay(double price) {
        System.out.printf("Sum %.2f is payed by Revolut!\n", price);
    }
}
