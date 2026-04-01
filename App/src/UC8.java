import java.util.*;
import java.util.stream.*;

public class UC8 {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("B1", 40));
        bogies.add(new Bogie("B2", 60));
        bogies.add(new Bogie("B3", 30));
        bogies.add(new Bogie("B4", 80));
        bogies.add(new Bogie("B5", 50));

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity >= 50)
                .collect(Collectors.toList());

        filtered.forEach(b -> System.out.println(b.name + " - " + b.capacity));
    }
}