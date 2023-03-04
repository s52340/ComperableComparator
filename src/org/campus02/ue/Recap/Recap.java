package org.campus02.ue.Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recap {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 8, 4};
        //Array sortieren
        Arrays.sort(numbers); // natürliche Reihenfolge   -- kannn nur Arrays sortieren!!!
        System.out.println(Arrays.toString(numbers));



        ArrayList<String> names = new ArrayList<>();
        names.add("max");
        names.add("susi");
        names.add("john");
        //Listen sortieren
        Collections.sort(names);    // Listen sortieren nicht mit Arrays - mit Collections sortieren!!
        System.out.println(names);


        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 28));
        apples.add(new Apple("green", 15));
        apples.add(new Apple("yellow", 35));
        //Damit wir Apple sortieren können,
        // brauchen wir die compareTo von Comparable
        Collections.sort(apples);
        System.out.println(apples);



    }
}
