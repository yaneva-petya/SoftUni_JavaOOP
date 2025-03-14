package solid.products.food;

// Violation of Liskov Substitution

public class Cloud implements Food{

    @Override
    public double getCalories() {
       throw new UnsupportedOperationException("Clouds do not have calories!They can not be eaten!");

    }

    @Override
    public double getKilograms() {
        return 500000;
    }
}
