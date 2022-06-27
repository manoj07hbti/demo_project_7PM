package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        //TODO How to Take Data from User
        Scanner obj= new Scanner(System.in);// creating object of Scanner Class

        System.out.println("Please enter your name ...");
        //TODO Read String Input
        String name=  obj.nextLine();// Reads String input

        System.out.println("YOu have entered name as : "+name);

        //TODO read int value
        System.out.println("Please enter you age : ");
        int age= obj.nextInt();// reads integer value

        System.out.println("Yuu have entered Age as : "+age);

        //TODO read decimal values

        System.out.println("Please enter your salary ...");
        double salary= obj.nextDouble();// reads decimal input
        System.out.println("Yuu have entered salary as : "+salary);
    }
}
