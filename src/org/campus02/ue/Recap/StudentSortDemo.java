package org.campus02.ue.Recap;

import org.campus02.ue.Student;
import org.campus02.ue.StudentNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "max","mustermann"));
        students.add(new Student(1, "susi","sorglos"));
        students.add(new Student(6, "susi","mustermann"));

        //1.Möglichkeit zu sortieren
        //Collections.sort(students, new StudentNameComparator());

        //2.Möglichkeit zu sortieren
        students.sort(new StudentNameComparator());
        System.out.println(students);





        //seit Java 8 anonyme Klassen
        //sortieren nach Nachname absteigend - anonyme Klasse wird nur für diesen einen Aufruf erstellt - gilt nur hier
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student otherStudent) {
                return otherStudent.getLastName().compareTo(student1.getLastName());
            }
        });
        System.out.println(students);


        //sortieren nach Nachnamen aufsteigend
        //wir verwenden Lambda expressions    (parameter) --> {Ausdruck}
        students.sort(
                //(Student student, Student other)-> student.getLastName().compareTo(other.getLastName())
                (student, other) -> student.getLastName().compareTo(other.getLastName())
        );

        //sortieren nach Vorname aufsteigend
        //Methode Reference
        students.sort(Comparator.comparing(Student::getFirstName));


        //sortieren nach Nachname aufsteigend,
        //dann nach Vornamen aufsteigend
        students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));


        //sortieren nach Nachname aufsteigend,
        //dann sortieren nach Vornamen absteigend
        students.sort(Comparator.comparing(Student::getLastName).thenComparing(   //strg + Leertaste
                (student, other) -> other.getFirstName().compareTo(student.getFirstName())));


        /* so schreiben - ins graue klicken + alt + enter -->Replace with lambda -->graue klicken - alt + enter --Replace with Comporater.comparing
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student o2) {
                return student.getFirstName().compareTo(o2.getFirstName());
            }
        });

          -- dann entsteht untere zeile
          */

        students.sort(Comparator.comparing(Student::getFirstName));
    }
}
