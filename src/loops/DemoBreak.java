package loops;

public class DemoBreak {

    //TODO-  break keyword : we can use this to break the loop and get exit
    public static void main(String[] args) {


        for (int i=0; i <10; i++){

            System.out.println("Hello "+i);

            if(i==7){
                break;
            }

        }
    }
}
