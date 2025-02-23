package Lab.WorkingWithAbstraction.HotelReservation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] input=s.nextLine().split("\\s+");
        double pricePerDay=Double.parseDouble(input[0]);
        int numberOfDays=Integer.parseInt(input[1]);
        Season season= Season.valueOf(input[2]);
        Discount discount=Discount.valueOf(input[3]);

        double totalPrice=PriceCalculator.calculate(pricePerDay,numberOfDays,
                season,discount);
        System.out.printf("%.2f\n", totalPrice);
    }
}
