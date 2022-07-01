package arrays;

import java.util.ArrayList;

public class ArrayListGenerics {

    //TODO : ArrayList <DATATYPE> objName= new ArrayList<>();

    public  ArrayList<String> createStringArrayList(){

        ArrayList <String> stringArrayList= new ArrayList<>();
        stringArrayList.add("Agra");
        stringArrayList.add("Pune");
        stringArrayList.add("Jaipur");
       // stringArrayList.add(33); not allowed

        return stringArrayList;
    }

    public  ArrayList<Integer> creatIntegerList(){

        ArrayList<Integer> marks= new ArrayList<>();

        marks.add(33);
        marks.add(75);
        marks.add(45);
        //marks.add("A"); not allowed

        return marks;

    }

    //DoubleList prices

    public static void main(String[] args) {

        ArrayListGenerics obj= new ArrayListGenerics();
        ArrayList<String> list=  obj.createStringArrayList();

        for (int i=0;i<list.size(); i++){

            System.out.println("Printing list : "+list.get(i));
        }

        // advanced for loop for (Datatype var: CollectionName){CODE}
        for(String var: list){

            System.out.println("Advanced Loop loop "+var);
        }

        ArrayList<Integer> result= obj.creatIntegerList();
        // normal for loop
        // advanced for loop

    }

}
