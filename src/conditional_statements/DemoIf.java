package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

        // SYNTAX : if (condition){
        //                          CODE
        //                        }

        int age ;

        age=19;

        if(age>18){

            System.out.println("Eligible for voting ...");
        }

        String city;
        city="DELHI";

        if(city=="AGRA"){

            System.out.println("You are in AGRA ");
        }else {
            System.out.println("You are NOT in AGRA ");
        }


        //SYNTAX : if(condition){CODE1}
        //                 else {CODE2}

        age=10;
        if (age>18){

            System.out.println("Eligible for voting .....");
        }
        else {
            System.out.println("NOT Eligible for voting .....");
        }


        double price= 5000.00;

        if(price>5000){
            System.out.println("It is a costly product ..");
        }else {
            System.out.println("It is NOT  costly product ..");
        }


    }
}
