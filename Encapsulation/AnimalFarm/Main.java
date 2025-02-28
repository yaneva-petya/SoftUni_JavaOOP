package Exercise.Encapsulation.AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            String chickenName=s.nextLine();
            int age=Integer.parseInt(s.nextLine());

            Chicken chicken=new Chicken(chickenName,age);
            System.out.println(chicken.toString());

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }
}
