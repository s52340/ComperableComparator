package org.campus02.ue;

import java.util.ArrayList;
import java.util.Collections;

public class StudentListDemo {
    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(234, "bici", "thaler"));
        studentArrayList.add(new Student(456, "veri", "thaler"));
        studentArrayList.add(new Student(2, "patrick", "thaler"));
        studentArrayList.add(new Student(12, "alina", "thaler"));
        studentArrayList.add(new Student(123, "nadi", "jansi"));

        Collections.sort(studentArrayList, new StudentNameComparator());
        System.out.println(studentArrayList);







    }
}
