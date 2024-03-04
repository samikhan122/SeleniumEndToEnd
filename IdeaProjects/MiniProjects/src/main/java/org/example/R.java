package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class R {
    public static void main(String[] args) {
        int i[] = {10, 20, 30, 54, 50};
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);


        }


        ArrayList<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(2,100);
        num.add(3,100);
        num.remove(2);

//        for (int l = 0; l <=num.size() ; l++) {
//            System.out.println(num.get(l));
//        }
        System.out.println(Arrays.toString(num.toArray()));
    }


}
