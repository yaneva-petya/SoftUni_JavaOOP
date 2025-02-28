package Exercise.Encapsulation.ClassBox;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            double length = Double.parseDouble(s.nextLine());
            double width = Double.parseDouble(s.nextLine());
            double height = Double.parseDouble(s.nextLine());
            Box box = new Box(length, width, height);

            double surfaceArea, lateralSurfaceArea, volume;
            surfaceArea = box.calculateSurfaceArea();
            lateralSurfaceArea = box.calculateLateralSurfaceArea();
            volume = box.calculateVolume();

            System.out.printf("Surface Area - %.2f\n",surfaceArea);
            System.out.printf("Lateral Surface Area - %.2f\n",lateralSurfaceArea);
            System.out.printf("Volume - %.2f\n",volume);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
