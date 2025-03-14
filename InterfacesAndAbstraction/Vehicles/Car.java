package Lab.Vehicles;

public class Car extends Vehicles {
    private static final double ADDITIONAL_AC_CONSUMPTION=0.9;

    public Car(double fuelQuantity,
               double fuelConsumptionPerKm, double tankCapacity){
        super(fuelQuantity,fuelConsumptionPerKm, tankCapacity);
        this.fuelConsumptionPerKm=fuelConsumptionPerKm+ADDITIONAL_AC_CONSUMPTION;
    }


}
