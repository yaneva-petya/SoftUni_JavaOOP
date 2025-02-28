package Lab.Encapsulation.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SalaryIncrease {
    public static void main(String[] args) throws IOException, IllegalAccessException {
      //Validation Data

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try {
                people.add(new Person(input[0],
                        input[1],
                        Integer.parseInt(input[2]),
                        Double.parseDouble(input[3])));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        double bonus = Double.parseDouble(reader.readLine());
       for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
       //Salary Increase
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Exercise.Inheritance.Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Exercise.Inheritance.Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
        }
        double bonus = Double.parseDouble(reader.readLine());
        for (Exercise.Inheritance.Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }*/

        //Sort By Name and Age
          /*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Exercise.Inheritance.Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Exercise.Inheritance.Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (sComp != 0) {
                return sComp;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Exercise.Inheritance.Person person : people) {
            System.out.println(person.toString());
        }*/
    }

}
