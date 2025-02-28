package Exercise.Encapsulation.ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) throws IllegalAccessException {
      setName(name);
      setCost(cost);
    }

    public void setName(String name) throws IllegalAccessException {
        if (name.trim().isEmpty()){
            throw new IllegalAccessException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost()  {
        return cost;
    }

    public void setCost(double cost) throws IllegalAccessException {
        if(cost<=0){
            throw new IllegalAccessException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
