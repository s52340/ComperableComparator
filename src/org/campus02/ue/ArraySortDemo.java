package org.campus02.ue;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 1 , 8, 9, 3};

        Arrays.sort(numbers);

        //iter
        for (int number : numbers){
            System.out.println(number);
        }
        char[] chars = {'a', 'c','z', 'b'};
        Arrays.sort(chars);
        System.out.println(chars);

        String[] strings = {"max", "susi", "john"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        int[] arr = { 1, 4, 7, 3};
        String[] namen = {"eva", "simon", "bianca"};

        Student[] students = {new Student(123, "susi", "jansi"),
        new Student(234, "bici", "thaler"),
        new Student(456, "veri", "thaler")};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(namen);
        System.out.println(Arrays.toString(namen));


        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }
}
