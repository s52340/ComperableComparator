package org.campus02.ue;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, name, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    /**
     * Sortiere die Employees aufsteigend nach empNumber
     * @param o
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        /*
        if (this.empNumber < o.empNumber){
            return -1;
        }
        if (this.empNumber > o.empNumber){
            return 1;
        }
        return 0;
         */

        return Integer.compare(this.empNumber, o.empNumber);
    }

}
