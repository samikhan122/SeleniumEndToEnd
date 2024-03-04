import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>(15);
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);
        ar.remove(0);
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        //after JDK 8 - lamda was introduced


        //for loop, for each Loop, iterator, java stream after JDK 8 ( 4 different ways to print the arraylist from the connect)
        ar.stream().forEach(ele -> System.out.println(ar));

        Iterator<Object> it = ar.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
