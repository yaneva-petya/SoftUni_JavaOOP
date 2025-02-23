
package Exercise.WorkingWithAbstraction.greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] itemsAndQuantities = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long[] totals = new long[3]; // 0: Gold, 1: Gems, 2: Cash

        for (int i = 0; i < itemsAndQuantities.length; i += 2) {
            String name = itemsAndQuantities[i];
            long quantity = Long.parseLong(itemsAndQuantities[i + 1]);

            addTreasureToBag(bag, name, quantity, bagCapacity, totals);
        }

        // Print the contents of the bag
        printBagContents(bag);
    }

    private static boolean hasBagSpace(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long bagCapacity, long quantity) {
        long currentTotal = bag.values().stream().flatMap(m -> m.values().stream()).mapToLong(Long::longValue).sum();
        return currentTotal + quantity <= bagCapacity;
    }

    private static String getTreasureType(String name) {
        if (name.length() == 3) return "Cash";
        if (name.toLowerCase().endsWith("gem")) return "Gem";
        if (name.equalsIgnoreCase("gold")) return "Gold";
        return "";
    }

    private static void addTreasureToBag(LinkedHashMap<String, LinkedHashMap<String, Long>> bag,
                                         String name, long quantity, long bagCapacity,
                                         long[] totals) {
        String treasureType = getTreasureType(name);
        if (treasureType.isEmpty() || !hasBagSpace(bag, bagCapacity, quantity)) return;

        // Ensure that Gems do not exceed Gold, and Cash does not exceed Gems
        if (treasureType.equals("Gem") && (totals[0] < totals[1] + quantity)) return;
        if (treasureType.equals("Cash") && (totals[1] < totals[2] + quantity)) return;

        // Add to bag
        bag.putIfAbsent(treasureType, new LinkedHashMap<>());
        bag.get(treasureType).put(name, bag.get(treasureType).getOrDefault(name, 0L) + quantity);

        // Update totals
        totals[getIndex(treasureType)] += quantity;
    }

    private static int getIndex(String treasureType) {
        switch (treasureType) {
            case "Gold": return 0;
            case "Gem": return 1;
            case "Cash": return 2;
            default: return -1;
        }
    }

    private static void printBagContents(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));


        }
    }
}
