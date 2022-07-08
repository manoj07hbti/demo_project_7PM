package collection_demo.hashmap;

import model.Student;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createHashMap(){

        //TODO   HashMap <DataType_key, DataType_Value> objName= new HashMap<>();

        HashMap <Integer,String> course= new HashMap<>();

        //TODO adding an element map.put(key,value);
        course.put(1,"Java");
        course.put(2,"Spring Boot");
        course.put(3,"Cloud");
        course.put(4,"Microservice");

        //TODO reading element  map.get(key);
        System.out.println("Printing Map: "+course.get(1));
        System.out.println("Printing Map: "+course.get(2));
        System.out.println("Printing Map: "+course.get(3));
        System.out.println("Printing Map: "+course.get(4));

        //TODO keySet(); it returns set of key

        Set<Integer> keys=course.keySet();

        for(Integer var: keys){

           System.out.println("Printing in Loop "+course.get(var));
        }

    }

    public void createStudentMap(){

        //TODO   HashMap <DataType_key, DataType_Value> objName= new HashMap<>();

        HashMap<String, Student> studentHashMap = new HashMap<>();

        Student student1= new Student("Rahul",20,"A");

        Student student2= new Student("Rohit",19,"C");

        Student student3= new Student("Rakesh",20,"B");


        studentHashMap.put("A",student1);
        studentHashMap.put("B",student2);
        studentHashMap.put("C",student3);

        System.out.println("Printing "+studentHashMap.get("C").getName());
        System.out.println("Printing "+studentHashMap.get("A").getName());
        System.out.println("Printing "+studentHashMap.get("B").getName());


        for (String var: studentHashMap.keySet()){

            System.out.println("Printing inside LOOP  "+studentHashMap.get(var).getName());

        }

    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();
        obj.createStudentMap();

    }
}
