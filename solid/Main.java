package solid;

import solid.Calculator.Calculator;
import solid.Calculator.CalorieCalculator;
import solid.Calculator.QuantityCalculator;
import solid.Printer.Printer;

public class Main {

    public static void main(String[] args) {
        //SOLID
        // S -> Single Responsibility
        // O -> Open-closed principle - open for extensions and closed for modifications
        // L -> Liskov Substitution - every object must have the ability to be replaced by its successor
        // I -> Interface Segregation - it is better to have more interfaces with few methods, instead of one interface with many methods
        // D -> Dependency Inversion - we rely on abstractions, not implementations


        Calculator calorieCalculator=new CalorieCalculator();
        Calculator quantityCalculator=new QuantityCalculator();

        Printer printCalories=new Printer(calorieCalculator);
        Printer printQuantity=new Printer(quantityCalculator);

    }
}
