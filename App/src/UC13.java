import java.util.*;
import java.util.stream.*;

public class UC13
{

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            bogies.add(new Bogie(i % 2 == 0 ? "Sleeper" : "AC", i % 100));
        }

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity >= 50) {
                loopResult.add(b);
            }
        }
        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity >= 50)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();

        long loopTime = endLoop - startLoop;
        long streamTime = endStream - startStream;

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}