package HackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWithIterator {
    static int i = 10;

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();33
//            System.out.println("Key: " + key + ", value: " + value);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println("Key: " + key + ", value: " + value);

            map.forEach((k, v) -> System.out.println("Key = " + k + " value = " + " " + v));
        }


    }

    public boolean firstLast6(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6)
                return true;


        }
        return false;
    }


    public boolean sameFirstLast(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] / 2 == 0)
                return true;

        }
        return false;
    }

}
