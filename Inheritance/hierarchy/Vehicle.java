package Exercise.Inheritance.hierarchy;


public class Vehicle {

    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

   public Vehicle(double fuel, int horsePower){
        this.fuelConsumption=DEFAULT_FUEL_CONSUMPTION;
        this.fuel=fuel;
        this.horsePower=horsePower;
    }

    public double getFuelConsumption(){return fuelConsumption;}
    public double getFuel(){return fuel;}
    public int getHorsePower(){return horsePower;}

    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption=fuelConsumption;
    }
    public void setFuel(double fuel){
        this.fuel=fuel;
    }
    public void setHorsePower(int horsePower){
        this.horsePower=horsePower;
    }

    public void drive(double kilometers){
        double neededFuel=kilometers*fuelConsumption;
        if(this.getFuel()>=neededFuel){
            this.setFuel(this.getFuel()-neededFuel);
        }
    }



}
