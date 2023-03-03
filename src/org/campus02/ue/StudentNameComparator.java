package org.campus02.ue;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student other) {

        int result = student.getLastName().compareTo(other.getLastName()); //aufsteigende Reihenfolge
        if (result == 0){
            return other.getFirstName().compareTo(student.getFirstName()); //absteigende Reihenfolge
        }
        return result;
    }
}
