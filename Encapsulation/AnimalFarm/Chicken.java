package Exercise.Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) throws IllegalAccessException {
     setName(name);
     setAge(age);
    }
    public String getName(){return name;}

    public int getAge() {
        return age;
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }
    private double calculateProductPerDay(){
        if (age <= 5) {
            return 2.0;
        } else if (age <= 11) {
            return 1.0;
        } else {
            return 0.75;
        }
    }

    public void setAge(int age) throws IllegalAccessException {
        if(age>15 || age<0){
            throw new IllegalAccessException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public void setName(String name) throws IllegalAccessException {
        if(name == null || name.isEmpty() || name.equals(" ")){
          throw new IllegalAccessException("Name cannot be empty.");
        }
        this.name=name;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",name, age,this.calculateProductPerDay() );
    }
}
