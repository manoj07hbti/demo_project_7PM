package class_and_object;

public class MethodWithParameter {

    // ******Syntax**** : access_specifier return_type  method_name (parameter) {}

    //: access_specifier return_type  method_name (Datatype varName, Datatype varName) {}

    public void hello(String name){

        System.out.println("Hello, Welcome to Java Programming ..."+name);
    }

    public void makeSquare(int number){

        System.out.println("Square of number is "+number*number);
    }

    public void voting(int age, String city){

        if(age>18 & city=="AGRA"){

            System.out.println("Eligible for voting in Agra ...");
        }
        else {
            System.out.println("NOT Eligible for voting in Agra ...");
        }

    }

    public static void main(String[] args) {

        // step 1 : create object
        MethodWithParameter obj= new MethodWithParameter();
       // step 2
        obj.hello("RAHUL");// pass the value of parameter
        obj.makeSquare(7);
        obj.voting(17,"AGRA");

    }
}
