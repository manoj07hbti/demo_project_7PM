package loops;

public class DemoLoop {

    public static void main(String[] args) {


      /*  System.out.println("Hello...");
        System.out.println("Hello...");
        System.out.println("Hello...");
        System.out.println("Hello...");
        System.out.println("Hello...");*/


        //SYNTAX :   for(initialization; condition; increment){
        ////              statement or code to be executed
        //                                                 }

        // increment for loop i++= i+1;

        for (int i=1; i<=10; i++){
            System.out.println(" Inside for loop Hello..."+i);
        }

        // decrement for :     for(initialization; condition; decrement){
        //        ////              statement or code to be executed
        //        //                                                 }

        for (int i=10; i>0; i--){

            System.out.println(" Inside Decrement for loop Hello..."+i);
        }

    }
}
