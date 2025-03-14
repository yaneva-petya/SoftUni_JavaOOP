package Lab.InterfacesAndAbstraction.CarShop;

public class Audi extends CarImpl implements Rentable{
    private Integer minRenDay;
    private Double pricePerDay;
    public Audi(String model, String color, Integer horsePower,
                String countryProduced,Integer minRenDay, Double pricePerDay){
        super(model, color, horsePower, countryProduced);
        this.minRenDay=minRenDay;
        this.pricePerDay=pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return this.minRenDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }
}
