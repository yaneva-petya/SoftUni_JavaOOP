package Exercise.InterfacesAndAbstraction.BirthdayCelebrations_03.BirthdayCelebrations_03;

public class Citizen implements Person, Identifiable, Birthable{
    private String name;
    private int age;
    private String id;
    private String birthDay;

    public Citizen(String name, int age,
                   String id, String birthDay){
        this.name=name;
        this.age=age;
        this.id=id;
        this.birthDay=birthDay;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDay;
    }

    @Override
    public String getId() {
        return id;
    }
}
