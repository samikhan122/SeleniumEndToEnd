package HashMaP;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> emp = new LinkedHashMap<>();
        emp.put(null, "loru"); //{null=loru, 1=ALi, 2=Ayesa, 3=bella, 4=billu}
        emp.put(1, "ALi");
        emp.put(2, "Ayesa");
        emp.put(3, "bella");
        emp.put(4, "billu");//{1=ALi, 2=Ayesa, 3=bella, 4=billu, null=null}
        //emp.put(1, null);

       // emp.put(null, null);
//maintain the insertion order but its not index based
        System.out.println(emp);
    }
}
