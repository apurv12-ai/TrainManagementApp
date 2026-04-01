import java.util.*;

public class UC14 {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity < 0) {
                throw new InvalidCapacityException("Invalid capacity for bogie: " + name);
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("========================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie("B1", 50));
            bogies.add(new PassengerBogie("B2", 60));
            bogies.add(new PassengerBogie("B3", -10));
            bogies.add(new PassengerBogie("B4", 40));
        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}