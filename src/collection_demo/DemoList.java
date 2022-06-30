package collection_demo;

import java.util.ArrayList;

public class DemoList {

    // create city data

    public void createCityData(){

        String city1="AGRA";
        String city2="Delhi";
        String city3="Jaipur";
        String city4="Pune";

      //TODO SYNTAX: ArrayList objName= new ArrayList();

        ArrayList cities= new ArrayList();

      // adding data to collection : objName.add(object);

        cities.add("AGRA");// 0 index
        cities.add("Delhi");//1 index
        cities.add("Jaipur");//2 index
        cities.add("Pune");//3 index
        cities.add(33);

      // get data from list : ObjName.get(index);

        System.out.println("Printing data from 3 rd index  " +cities.get(3));
        System.out.println("Printing data from 2  index  " +cities.get(2));
        System.out.println("Printing data from 0  index  " +cities.get(0));

      // printing all data

        for (int i=0; i<cities.size(); i++){

            System.out.println("Printing data in loop " +cities.get(i));
        }

       // advanced for loop for (Datatype var: COllectionName){CODE}
       for(Object var: cities){

           System.out.println("Advanced loop "+var);
       }

    }



    public static void main(String[] args) {

        DemoList obj= new DemoList();
        obj.createCityData();

    }
}
