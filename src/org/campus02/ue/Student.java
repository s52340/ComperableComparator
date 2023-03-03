package org.campus02.ue;

public class Student implements Comparable<Student> {
    private int matrNr;
    private String firstName;
    private String lastName;

    public Student(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * Studenten sollen !absteigend! nach Mat.Nr. sortiert werden
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
      return   Integer.compare(o.matrNr, this.matrNr);    //Parameter umdrehen dann ist es absteigend ! :)
    }
}
