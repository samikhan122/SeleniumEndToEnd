import java.util.HashMap;

public class HashMapMethod {
    public static void main(String[] args) {
        HashMapMethod hp = new HashMapMethod();
        System.out.println(hp.mapMyThings(1));
    }


    public String mapMyThings(int role) {
        HashMap<Integer, String> mapp = new HashMap<>();
        mapp.put(1, "Ali");
        mapp.put(2, "Ayesha");
        mapp.put(3, "Bellla");
        return mapp.get(role);
    }
}
