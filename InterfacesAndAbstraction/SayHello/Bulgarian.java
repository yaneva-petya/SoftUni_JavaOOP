package Lab.InterfacesAndAbstraction.SayHello;

public class Bulgarian extends BasePerson implements Person {
  //  private String name;
    public Bulgarian(String name){
       super(name);
    }


    @Override
    public String sayHello() {
       return "Здравей";
    }
}
