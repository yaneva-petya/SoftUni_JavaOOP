package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    Topping(String toppingType, double weight) throws IllegalAccessException {
        setToppingType(toppingType);
        setWeight(weight);
    }
    private void setToppingType(String toppingType) throws IllegalAccessException {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
            default:
                throw new IllegalAccessException(String.format("Cannot place %s on top of your pizza.", toppingType));

        }
    }
    private void setWeight(double weight){

        if(weight<1 || weight>50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.toppingType));
        }
        this.weight=weight;
    }

    public double calculateCalories(){
        /*•	Meat – 1.2;
•	Veggies – 0.8;
•	Cheese – 1.1;
•	Sauce – 0.9;
*/
        double  coefficientToppingType=0;
        if(this.toppingType.equals("Meat")){
            coefficientToppingType=1.2;
        } else if (this.toppingType.equals("Veggies")) {
            coefficientToppingType=0.8;
        } else if (this.toppingType.equals("Cheese")) {
            coefficientToppingType=1.1;
        } else if (this.toppingType.equals("Sauce")) {
            coefficientToppingType=0.9;
        }
        return 2*this.weight*coefficientToppingType;
    }
}
