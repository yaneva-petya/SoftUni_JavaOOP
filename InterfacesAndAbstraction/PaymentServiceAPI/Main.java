package Lab.InterfacesAndAbstraction.PaymentServiceAPI;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String payableChoice=s.nextLine();
        double price=Double.parseDouble(s.nextLine());

        Map<String, Payable> payableMap= Map.of(
                "Credit card", new CreditCardPayment(),
                "Revolut", new RevolutPayment(),
                "PayPal", new PayPalPayment());


        Payable payable=payableMap.get(payableChoice);
        pay(payable,price);
    }

    //More Abstraction
    static void pay(Payable payable, double price){
        payable.pay(price);
    }
}
