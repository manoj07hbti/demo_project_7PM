package loops;

public class DemoWhileLoop {

    public static void main(String[] args) {

        //SYNTAX: 1.	while (condition){
        //2.	//            code to be executed
        //3.	             Increment / decrement statement
        //4.	             }

       int i=0;
       // increment while loop

       while (i<5){

           System.out.println("Hello ...."+i);
           i++;// i=i+1;
       }

       // decrement while loop

        i=10;

       while (i>0){

           System.out.println("Decrement While loop "+i);
           i--; // i=i-1;
       }

    }
}
