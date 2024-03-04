import java.util.HashMap;

public class MapHash01 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "loru");
        hash.put(2, "basheer");
        hash.put(3, "Ali");
        hash.put(4, "ki");
        hash.put(5, "Koi Ukaat nai");

        System.out.println(hash);
        System.out.println(hash.size()); // this is to get the total value from the index.

        hash.remove(2);

      //  System.out.println(hash);


        System.out.println(hash.keySet()); // to print only key value

    }
}
