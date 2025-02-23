package Lab.WorkingWithAbstraction.HotelReservation;

public enum Discount {

    VIP(20),
    SecondVisit(10),
    None(0);

    private double discountPercentage;

    Discount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

}
