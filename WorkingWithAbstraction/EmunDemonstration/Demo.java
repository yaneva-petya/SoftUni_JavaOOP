package Lab.WorkingWithAbstraction.EmunDemonstration;

import Lab.WorkingWithAbstraction.EmunDemonstration.Month;

public class Demo {
    public static void main(String[] args) {
        //System.out.println(Month.DECEMBER);
        //Month[] values=Month.values();
        //for (Month value : values) {
          //  System.out.println(value);
        //}

        //System.out.println(Month.valueOf("DECEMBER"));
        System.out.println(Month.JULY.toString());
        System.out.println(calSalary(Month.FEBRUARY));
    }

    public static double calSalary(Month month){
        return month.calculateSalary(100);
    }
}
