package methods;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a, int b){

        int sum=a+b;

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter value of a: ");
        int a= scanner.nextInt();

        System.out.println("Please enter value of b: ");
        int b = scanner.nextInt();

        System.out.println("Please enter you choice for Calculator :1 for addition, 2 for subtraction, 3 for multiply and 4 for divide ");
        int choice=scanner.nextInt();

        CalculatorApp obj= new CalculatorApp();
        if(choice==1) {
            int result = obj.add(a, b);
            System.out.println("Addition is " + result);
        }
        else  if (choice==2){

            // call subtraction logic
        }else  if(choice==3){

            //call multiply logic
        }else {

            // call divide logic
        }


    }
}
