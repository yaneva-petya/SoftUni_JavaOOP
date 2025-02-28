package Exercise.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
   private String name;
   private double money;
   private List<Product> products;

   public Person(String name, double money) throws IllegalAccessException {
      setName(name);
      setMoney(money);
      this.products=new ArrayList<>();
   }

   public void setName(String name) throws IllegalAccessException {
      if (name.trim().isEmpty()){
         throw new IllegalAccessException("Name cannot be empty");
      }
      this.name = name;
   }
   public void setMoney(double money) throws IllegalAccessException {
      if(money<0){
         throw new IllegalAccessException("Money cannot be negative");
      }
      this.money = money;
   }

   public String getName() {
      return name;
   }
   public double getMoney() {
      return money;
   }
   public List<Product> getProducts() {
      return products;
   }

   public void buyProduct(Product product){
      if (this.money >= product.getCost()) {
         this.products.add(product);
         this.money -= product.getCost();
         System.out.println(this.name + " bought " + product.getName());
      } else {
         throw new IllegalArgumentException(String.format("%s can't afford %s" ,this.name, product.getName()));
      }
   }




   @Override
   public String toString() {
      return String.format("%s - ", name, String.join(", ", products.toString()));
   }
}
