package org.example;

import java.util.ArrayList;

public class AddAllArray {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Java");
        ar1.add("Phyton");
        ar1.add("Ruby");
        ar1.add("JavaScript");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Testing");
        ar2.add("dev Ops");

       // System.out.println(ar1);
        ar1.addAll(ar2);

        ar1.clear();

        System.out.println(ar1);

    }
}
