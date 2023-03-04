package org.campus02.ue;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student other) {

        int result = student.getLastName().compareTo(other.getLastName()); //aufsteigende Reihenfolge   strg + alt + v - speichert in variable ab
        if (result == 0){
            return other.getFirstName().compareTo(student.getFirstName()); //absteigende Reihenfolge
            // 2.Möglichkeit: result= other.getFirstName().compareTo(student.getFirstName());
        }
        return result;
    }
}
