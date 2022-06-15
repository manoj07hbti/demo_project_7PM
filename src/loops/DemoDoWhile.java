package loops;

public class DemoDoWhile {

    public static void main(String[] args) {

        // do {CODE
        //   incr/decrement}
        // while(condition);

        int i=0;

        do {
            System.out.println("Do While Loop..."+i);
            i++;
        }
        while (i<10);

        i=10;

        do {

            System.out.println("Decrement while Loop "+i);
            i--;
        }while(i>0);

    }
}
