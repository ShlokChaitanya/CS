import java.util.*;

public class maintest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long startMem = runtime.totalMemory() - runtime.freeMemory();

        long start = System.nanoTime(); 
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add((int)(Math.random() * 1_000_000));
        }
        Collections.sort(list);
        long end = System.nanoTime();

        long endMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Time taken: " + ((end - start) / 1e9) + "s");
        System.out.println("Memory used: " + ((endMem - startMem) / (1024 * 1024)) + " MB");
    }
}
