import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("BG201");
        formation.add("BG202");
        formation.add("BG203");
        formation.add("BG204");
        formation.add("BG202");
        formation.add("BG203");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("Total Bogies: " + formation.size());
    }
}