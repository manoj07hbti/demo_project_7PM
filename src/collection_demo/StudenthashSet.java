package collection_demo;

import model.Student;

import java.util.HashSet;

public class StudenthashSet {



    public HashSet <Student> createStudentSet(){

        //TODO Syntax: HashSet<DataType> ObjName= New HashSet<>();

        HashSet <Student> studentHashSet= new HashSet<>();

        // data : object of Student
        Student student1= new Student("Rahul",20,"A");

        System.out.println("Hashcode of student1: "+student1.hashCode());

        Student student2= new Student("ROhit",19,"C");
        System.out.println("Hashcode of student2: "+student2.hashCode());

        Student student3= new Student("Rakesh",20,"B");
        System.out.println("Hashcode of student3: "+student3.hashCode());

        Student student4= new Student("Rahul",20,"A");
        System.out.println("Hashcode of student4: "+student4.hashCode());

        Student student5= new Student("Rakesh",20,"B");
        System.out.println("Hashcode of student5: "+student5.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);

        return  studentHashSet;
    }

    public static void main(String[] args) {

        StudenthashSet obj= new StudenthashSet();
        HashSet <Student> studentHashSet=obj.createStudentSet();

        for (Student var: studentHashSet){

            System.out.println("Printing Student data "+var.getName() +" Age: "+var.getAge()+" Section:"+var.getSection());
        }

    }



}
