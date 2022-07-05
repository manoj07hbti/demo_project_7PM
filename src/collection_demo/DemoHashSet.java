package collection_demo;

import java.util.HashSet;

public class DemoHashSet {

    //TODO Syntax: HashSet<DataType> ObjName= New HashSet<>();
    //  it will automatically removes duplicate elements

    public  HashSet <String> createStringHashset(){

        HashSet <String> cities= new HashSet<>();

        cities.add("Agra");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Delhi");


        return cities;
    }

    public  HashSet<Integer> createIntegerSet(){

        HashSet<Integer> hashSet= new HashSet<>();

        hashSet.add(33);
        hashSet.add(35);
        hashSet.add(45);
        hashSet.add(33);
        hashSet.add(35);
        hashSet.add(45);

        return hashSet;
    }
    //TODO Assignment : 1- String HashSet , 2 Integer HashSet 3 Double HashSet

    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        HashSet <String> hashSet=obj.createStringHashset();

        for (String var: hashSet){

            System.out.println("Printing hashSet .."+var);
        }

        HashSet<Integer> marks= obj.createIntegerSet();


        for(Integer var: marks){

            System.out.println("Printing marks : "+var);
        }
    }

}
