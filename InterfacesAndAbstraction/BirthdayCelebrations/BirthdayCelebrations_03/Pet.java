package Exercise.InterfacesAndAbstraction.BirthdayCelebrations_03.BirthdayCelebrations_03;

public class Pet implements Birthable {
    private String name;
    private String birthdate;

    public Pet(String name, String birthdate){
        this.name=name;
        this.birthdate=birthdate;
    }


    @Override
    public String getBirthDate() {
        return birthdate;
    }

    public String getName(){
        return name;
    }
}
