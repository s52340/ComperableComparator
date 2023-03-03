package org.campus02.ue;

import java.util.Arrays;

public class EmplyeeSortDemo {

    public static void main(String[] args) {


        Employee[] employees = {new Employee(23, "susi", 120.45, "Development"),
                new Employee(12, "max", 234.45, "Research"),
                new Employee(3, "john", 345.78, "Sales"),
                new Employee(5, "marie", 345.789, "Marketing")};


        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
