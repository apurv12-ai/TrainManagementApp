import java.util.*;
import java.util.stream.*;

public class UC12 {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("========================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Closed", "Food"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Closed", "Chemicals"));
        goodsBogies.add(new GoodsBogie("Open", "Steel"));

        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g.type + " - " + g.cargo);
        }

        boolean isSafe = goodsBogies.stream()
                .allMatch(g -> !(g.type.equals("Open") && g.cargo.equals("Chemicals")));

        System.out.println("\nSafety Compliance Status: " + (isSafe ? "SAFE" : "NOT SAFE"));
    }
}