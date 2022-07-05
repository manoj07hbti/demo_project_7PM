package model;

public class Employee {
    // data members
    String name;
    Double salary;
    String dept;

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
