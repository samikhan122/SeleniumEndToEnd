package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsingIteratorAsMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> callerHashMap = new HashMap<>();
        String value = createHashMap().get(4);
        System.out.println("The value is " + value);
        System.out.println(fruit());
    }


    public static HashMap<Integer, String> createHashMap() {
        HashMap<Integer, String> createHashMap = new HashMap<>();
        createHashMap.put(1, "Apple");
        createHashMap.put(2, "Banana");
        createHashMap.put(3, "orange");
        createHashMap.put(4, "BlueBerry");
        createHashMap.put(4, "WaterMelon");
        createHashMap.put(4, "BlackBerry");

//Map.Entry() return a set of entries from the map mao and
// each entry variable in the loop represents one key-value of each entry using like getKey()
// getValue() provided by Map.entry interface.
        for (Map.Entry<Integer, String> entry : createHashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("The Key is " + key + " and the value is " + value);
        }
        return createHashMap;
    }

    public static HashMap<Integer, String> fruit() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Cadillac");
        cars.put(2, "lexus");
        cars.put(3, "Toyota");
        cars.put(4, "Honda");
        cars.put(5, "Subaru");


        Iterator<Map.Entry<Integer, String>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
        return cars;

    }


}
