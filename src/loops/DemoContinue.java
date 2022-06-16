package loops;

public class DemoContinue {

    //TODO- continue keyword : it will continue next cycle of loop and skip the code
    // 1- break point : stop execution of code
    //  2- Execution :
    //       F7: it will take you inside method
    //       F8: Line by line execution
    //       F9:  breakpoint to breakpoint

    public static void main(String[] args) {

        for(int i=0; i<5; i++){

            if(i==3){
                continue;
            }

            System.out.println("Hello "+i);
        }

    }
}
