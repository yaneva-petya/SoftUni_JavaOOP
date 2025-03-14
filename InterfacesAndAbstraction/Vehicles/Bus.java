package Lab.Vehicles;

public class Bus extends Vehicles{

    public Bus(double fuelQuantity,
               double fuelConsumptionPerKm,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
    }

    @Override
    public String drive(double distance){

        this.setFuelConsumptionPerKm(getFuelConsumptionPerKm()+1.4);
        return super.drive(distance);
    }

    public String driveEmpty(double distance){
        return super.drive(distance);
    }
}
