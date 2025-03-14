package Lab.Vehicles;

import java.text.DecimalFormat;

public class Vehicles {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKm;
    protected double tankCapacity;

    public Vehicles(double fuelQuantity,
                    double fuelConsumptionPerKm,double tankCapacity){
        this.fuelQuantity=fuelQuantity;
        this.fuelConsumptionPerKm=fuelConsumptionPerKm;
        this.tankCapacity=tankCapacity;
    }


    public String drive(double distance){
        StringBuilder message=new StringBuilder();
        double neededFuel=distance*fuelConsumptionPerKm;

        if(neededFuel>fuelQuantity){
            return message.append(String.format("%s needs refueling", this.getClass().getSimpleName())).toString();
        }

        this.fuelQuantity=this.fuelQuantity-neededFuel;
        DecimalFormat decimalFormat=new DecimalFormat("##.##");
        return  message.append(String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance))).toString();
    }

    public void refuel(double liters){
        if(liters<=0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        else if(liters+this.getFuelQuantity()>this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
           this.setFuelQuantity(this.getFuelQuantity()+liters);
    }

    public void setFuelQuantity(double fuelQuantity) {this.fuelQuantity=fuelQuantity;}
    public double getFuelQuantity(){return this.fuelQuantity;}

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm){
        this.fuelConsumptionPerKm=fuelConsumptionPerKm;
    }

    public double getFuelConsumptionPerKm(){return this.fuelConsumptionPerKm;}
public double getTankCapacity(){return this.tankCapacity;}
    public void setTankCapacity(double tankCapacity)
    {
        this.tankCapacity=tankCapacity;
    }    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
