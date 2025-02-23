package Exercise.WorkingWithAbstraction.Demo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name="Petya";
        System.out.printf("Hello my name is: %s," +
                " my role is: %s\n" , name, Role.ADMIN);
    }
}
