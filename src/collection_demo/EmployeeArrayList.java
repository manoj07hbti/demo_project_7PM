package collection_demo;

import model.Employee;


import java.util.ArrayList;

public class EmployeeArrayList {

    public void createEmployeeList(){

        // Create ArrayList of Employee

        //TODO : ArrayList <DATATYPE> objName= new ArrayList<>();
        ArrayList <Employee> employeeArrayList= new ArrayList<>();

        // model: Employee data name,salary,dept
        // create Employee Object
        Employee employee1= new Employee("Raj",32443.5,"IT");
        Employee employee2= new Employee("Rahul",42443.5,"CS");
        Employee employee3= new Employee("Mukesh",32443.5,"CS");

        employee1.setName("Raj Kumar Goyal");
        employee3.setDept("COMPUTER SCIENCE");
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        for (int i=0; i<employeeArrayList.size(); i++){

            System.out.println("Printing Employee: "+employeeArrayList.get(i).getName());
            System.out.println("Printing Employee Dept: "+employeeArrayList.get(i).getDept());
            System.out.println("Printing Employee Dept: "+employeeArrayList.get(i).getSalary());

            System.out.println("Printing Employee data in one line : "+employeeArrayList.get(i).getName() + " Salary: "+employeeArrayList.get(i).getSalary()+ " Dept: "+employeeArrayList.get(i).getDept());
        }

        for (Employee var: employeeArrayList){

            System.out.println("Printing data "+var.getName());
        }

    }


    public static void main(String[] args) {

        EmployeeArrayList obj= new EmployeeArrayList();
        obj.createEmployeeList();
    }
}
