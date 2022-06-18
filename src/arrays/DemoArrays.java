package arrays;

public class DemoArrays {

    public static void main(String[] args) {
        String city1="AGRA";
        String city2="DELHI";
        String city3="PUNE";

//TODO Arrays: it stores group of similar elements
// SYNTAX DATATYPE varname[]={value1,value2,value3.....valuen}

        String cities[]={"AGRA","DELHI","PUNE"};

//TODO access element in array :  VarName[INDEX];

        System.out.println("Printing Array : "+cities[1] );
        System.out.println("Printing Array : "+cities[2] );
        System.out.println("Printing Array : "+cities[0] );

        for (int i=0; i<cities.length; i++){

            System.out.println("Printing array in loop: " +cities[i]);
        }

//TODO : ADVANCED FOR LOOP: Array or collection
// for (DATATYPE VarName : Array){ CODE }

        for (String var : cities ){

          System.out.println("Advanced loop.."+var);
        }

        int marks1 =33;
        int marks2=50;
        int marks3=75;

        int marks []={33,50,75};

        for (int i=0; i <marks.length; i++){

            System.out.println("Printing Marks "+marks[i]);
        }
        for (int var: marks){

            System.out.println("Printing Advanced loop "+var);
        }

        double price1=435.5;
        double price2=3242.4;
        double price3=343.4;

    }

}
