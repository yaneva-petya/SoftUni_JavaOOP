package Lab.Vehicles;

public class Truck extends Vehicles{
    public static final double ADDITIONAL_AC_CONSUMPTION=1.6;
    public static final double FUEL_LEAK_CORRECTION_PERCENTAGE=0.95;

    Truck(double fuelQuantity, double fuelConsumptionPerKm,double tankCapacity){
        super(fuelQuantity,fuelConsumptionPerKm, tankCapacity);
        this.fuelConsumptionPerKm=fuelConsumptionPerKm+ADDITIONAL_AC_CONSUMPTION;
    }

    @Override
    public void refuel(double liters){
        liters=liters*FUEL_LEAK_CORRECTION_PERCENTAGE;
        super.refuel(liters);
    }

}

