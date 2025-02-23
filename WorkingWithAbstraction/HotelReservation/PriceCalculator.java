package Lab.WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {

    public static double calculate(double pricePerDay, int numberOfDays,
                                   Season season, Discount discount){
        double price=pricePerDay*numberOfDays*
                season.getMultiplier();
        return price-(price*discount.getDiscountPercentage()/100);

    }
}
