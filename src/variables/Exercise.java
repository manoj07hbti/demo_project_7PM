package variables;

public class Exercise {

    public static void main(String[] args) {

        // Write a program to change value of variable a=6 b=5

        int a=6;
        int b=5;
        System.out.println("Value of a and b before  change a: "+a +" b:"+b);
        int c=a;// c=6

        a=b;//
        b=c;//b=6 storing value of a into  b


        System.out.println("Value of a and b after change a: "+a +" b:"+b);
    }
}
