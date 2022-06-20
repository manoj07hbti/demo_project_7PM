package class_and_object;

public class Student {

    // data member
    String name="Bharat";
    int age=23;
    String section="B";

    public static void main(String[] args) {

        // TODO SYNTAX :  ClassName objName= new ClassName();

        Student obj=new Student();

        System.out.println("Printing student name "+obj.name);

    }
}
