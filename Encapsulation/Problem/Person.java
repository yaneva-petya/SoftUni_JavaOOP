package Lab.Encapsulation.Problem;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age,double salary) throws IllegalAccessException {
       setFirstName(firstName);
       setLastName(lastName);
       setAge(age);
       setSalary(salary);
    }

    public String getFirstName(){return this.firstName;}
    public void setFirstName(String firstName) throws IllegalAccessException {
        if(firstName.length()<3){
                throw new IllegalAccessException("First name cannot be less than 3 symbols");
            }

        this.firstName=firstName;
    }

    public String getLastName(){return this.lastName;}
    public void setLastName(String lastName) throws IllegalAccessException {

        if(lastName.length()<3){
                throw new IllegalAccessException("Last name cannot be less than 3 symbols");
        }
        this.lastName=lastName;}

    public int getAge() {return this.age;}
    public void setAge(int age) throws IllegalAccessException {
        if(this.age<=0) {
            throw new IllegalAccessException("Age cannot be zero or negative integer");
        }
        this.age=age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IllegalAccessException {
        if(this.salary<460.0){
            throw  new IllegalAccessException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva.",
                this.firstName,
                this.lastName,
                this.salary);
    }


    public void increaseSalary(double bonus) {
       if(this.getAge()<30){
           bonus=bonus/2;
       }
       this.salary+=this.salary*bonus/100;
    }
}
