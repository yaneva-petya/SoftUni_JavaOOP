package animals;

public class Tomcat extends Cat{
    private final static String GENDER = "Male";
    private final static String SOUND = "MEOW";


    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}
