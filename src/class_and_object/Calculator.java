package class_and_object;

public class Calculator {

    // add method

    // ******Syntax**** : access_specifier return_type  method_name (parameter) {}

    public void addition(){

        int a=14;
        int b=7;

        int sum=a+b;

        System.out.println("Addition of a and b is "+sum);
    }
    // subtraction

    public void multi(){

        int a=7;
        int b=5;
        int multi= a*b;

        System.out.println("Multiplication of a and b is "+multi);
    }

    // divide : a/b

    public static void main(String[] args) {
        //step1 : ClassName ObjName= new ClassName();
        Calculator obj= new Calculator();
        //step2 : obj.MethodName();
        obj.addition();
        //step2 : obj.MethodName();
        obj.multi();


    }
}
