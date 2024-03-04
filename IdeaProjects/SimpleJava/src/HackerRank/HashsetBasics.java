package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class HashsetBasics {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        // Using entrySet() to get the set view
        System.out.println("The set is: " + hash_map.entrySet());
    }


    public static void iterateUsingForEach(Map<String, String> map) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        // Using entrySet() to get the set view
        System.out.println("The set is: " + hash_map.entrySet());
        for (Map.Entry<String, String> entry : map.entrySet());
        map.forEach((k, v) -> System.out.println("Key = " + k + " value = " + " " + v));

    }
}
