package model;

import java.util.Objects;

public class Employee {
    // data members
    String name;
    Double salary;
    String dept;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                salary.equals(employee.salary) &&
                dept.equals(employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, dept);
    }
// parameterized constructor

    public Employee(String name, Double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    // getter: to read the data and setter : to change the data of object


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
