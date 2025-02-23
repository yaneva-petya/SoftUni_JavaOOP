package Exercise.WorkingWithAbstraction.CardsWithPower;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*System.out.println("Card Suits:");
        Suits[] suits=Suits.values();
        for (int suit = 0; suit < suits.length; suit++) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", suit,suits[suit]);
        }

        System.out.println("Card Ranks:");
        Ranks[] ranks=Ranks.values();
        for(Ranks rank:ranks){
            System.out.printf("Ordinal value: %d; Name value: %s\n", rank.ordinal(),rank.name());
        }*/

        Ranks rank= Ranks.valueOf(s.nextLine());
       Suits suit= Suits.valueOf(s.nextLine());
       int totalPower=rank.getPower()+suit.getPower();
        System.out.printf("Card name: %s of %s; Card power: %d",
               rank, suit,totalPower);
    }
}
