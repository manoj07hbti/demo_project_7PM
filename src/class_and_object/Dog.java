package class_and_object;

public class Dog {

    //data member
    String name;
    int age;
    String breed;

    // capabilities
    // eat
    // ******Syntax**** : access_specifier return_type  method_name (parameter) {}

    public void eat(){

        System.out.println("This is Eat Method of Dog Class....");
    }

    // run
    public void run(){
        System.out.println("This is Run Method of Dog Class....");
    }

    // sleep
    public void sleep(){

        System.out.println("This is Eat Method of Dog Class....");
    }

     /* todo    Member function or method -- capabilities
         ******Syntax**** : access_specifier return_type  method_name (parameter) {}
         access_specifier -> public , private , protected, default   THEORY PART
         return_type   -> output of function or method :  void : no return type
         method_name -> can be anything: it should be meaningful
         parameter ->  input parameter : optional*/




}
