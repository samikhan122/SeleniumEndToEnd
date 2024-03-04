package HashMaP;

import java.util.TreeMap;

public class TreeMapConceptExample {
    public static void main(String[] args) {
        TreeMap<String, String> emp1 = new TreeMap<>();
        //emp1.put(null, "loru");
        emp1.put("2", "Ayesha");
        emp1.put("3", "bella");
        emp1.put("4", "billu");
        emp1.put("5", "elmaz");
        emp1.put("6", "fahad");
        emp1.put("$", "Fahad");
        emp1.put("1", "Ali");
        emp1.put("7", "vipra");
        emp1.put("8", "Karishma");

        //maintain the sorted order meaning it will display a alphabetical order values
        // will display all alphabetical order

        //first key value will display $ sign
        //null cannot be added in treeamp

        boolean flag = emp1.containsKey("5");
        System.out.println(flag);

        System.out.println(emp1);


    }
}
