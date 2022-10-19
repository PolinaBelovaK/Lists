import java.util.ArrayList;
import java.util.Collections;

/**
 * Create array list and print all list randomly.
 */
public class Shuffle {
    public static void main(String[] args) {
        System.out.println(arrayList());
    }
    private static ArrayList<String> arrayList () {

        ArrayList<String> namesRandom = new ArrayList<>();
        namesRandom.add("James");
        namesRandom.add("Huan");
        namesRandom.add("Joli");
        namesRandom.add("Rebecca");
        namesRandom.add("Alisa");
        Collections.shuffle(namesRandom);
        return namesRandom;
    }
}

