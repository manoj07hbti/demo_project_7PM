package class_and_object;

public class Employee {

    //data member or properties

    String name;
    double salary;
    String dept;

    // parameterized constructor
    //TODO right click -->Generate-->Constructor --> Select all field -->OK


    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public static void main(String[] args) {

       // ClassName ObjName= new ClassName( property1Value,property2Value, property3Value.... );

        Employee obj1= new Employee("RAJ",234423.4,"IT");

        System.out.println("Printing obj 1 name : "+obj1.name);
        System.out.println("Printing obj 1 salary : "+obj1.salary);
        System.out.println("Printing obj 1 Dept : "+obj1.dept);

        Employee obj2= new Employee("Rahul",343242.5,"CS");

        System.out.println("Printing obj2 name : "+obj2.name);
        System.out.println("Printing obj2 salary : "+obj2.salary);
        System.out.println("Printing obj2 Dept : "+obj2.dept);

        Employee obj3=new Employee("Mukesh",2323232.4,"IT");

        System.out.println("Printing obj3 name : "+obj3.name);
        System.out.println("Printing obj3 salary : "+obj3.salary);
        System.out.println("Printing obj3 Dept : "+obj3.dept);
    }
}
