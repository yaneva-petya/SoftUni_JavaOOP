package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    Dough(String flourType, String bakingTechnique, double weight) throws IllegalAccessException {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) throws IllegalAccessException {
        if(flourType.equals("White")){
            this.flourType=flourType;
        } else if (flourType.equals("Wholegrain")) {
            this.flourType=flourType;
        }else {
            throw new IllegalAccessException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) throws IllegalAccessException {

        switch (bakingTechnique){
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique=bakingTechnique;
                break;
            default:
                throw new IllegalAccessException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) throws IllegalAccessException {
        if(weight<1 || weight>200){
          throw new IllegalAccessException("Dough weight should be in the range [1..200].");
        }
        this.weight=weight;
    }

    public double calculateCalories(){
       /* •	White – 1.5;
•	Wholegrain – 1.0;
•	Crispy – 0.9;
•	Chewy – 1.1;
•	Homemade – 1.0;*/
        double coefficientFlourType=0;
        if(this.flourType.equals("White")){
            coefficientFlourType=1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            coefficientFlourType=1.0;
        }

        double coefficientBakingTechnique=0;
        if(this.bakingTechnique.equals("Crispy")){
            coefficientBakingTechnique=0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            coefficientBakingTechnique=1.1;
        } else if (this.bakingTechnique.equals("Homemade")) {
            coefficientBakingTechnique=1.0;
        }
        return 2*this.weight*coefficientBakingTechnique*coefficientFlourType;


    }

}
