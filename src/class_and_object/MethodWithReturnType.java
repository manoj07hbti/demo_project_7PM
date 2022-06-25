package class_and_object;

public class MethodWithReturnType {

    //SYNTAX : access_specifier DATATYPE  method_name (input param..) {
    //
    //                     return value;
    //                     }

    // hello :

    public String hello(String name) {


        String result = "Welcome to return type " + name;

        return result;
    }

    public int makeSquare(int number) {

        int square = number * number;

        return square;
    }

    public String voting() {

        int age = 17;

        if (age > 18) {

            return "Eligible for voting";
        } else {
            return "NOT Eligible for voting";
        }

    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        String result = obj.hello("RAJ");//store result into variable

        System.out.println("Printing output: " + result);

        int output = obj.makeSquare(6);

        System.out.println("Square of given number is " + output);

        String vote = obj.voting();

        System.out.println("Voting eligibility is " + vote);

    }

}
