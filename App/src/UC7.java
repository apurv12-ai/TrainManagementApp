import java.util.*;

public class UC7 {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("======================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Cargo", 120));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Unsorted Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        Collections.sort(bogies, new Comparator<Bogie>() {
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity;
            }
        });

        System.out.println("\nSorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}