package Exercise.WorkingWithAbstraction.TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Lights[] lights= Arrays.stream(s.nextLine().split("\\s+"))
                .map(light->Lights.valueOf(light)).toArray(Lights[]::new);

        int numberOfChanges=Integer.parseInt(s.nextLine());

        for (int i = 1; i <= numberOfChanges ; i++) {
            changeLights(lights);
            printCurrentLights(lights);
        }
    }
    private static void changeLights(Lights[] lights) {


        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case RED:
                    lights[i] = Lights.GREEN;
                    break;
                case GREEN:
                    lights[i] = Lights.YELLOW;
                    break;
                case YELLOW:
                    lights[i] = Lights.RED;
                    break;
            }
        }

    }

    private static void printCurrentLights(Lights[] lights) {

        for (Lights light : lights){
            System.out.printf("%s ", light);
        }
        System.out.println();
    }
}
