package methods;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a, int b){

        int sum=a+b;

        return sum;
    }
    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }

    public int  multi(int a, int b){

        int multi= a*b;


        return multi;
    }

    public double divide(int a, int b){

        double divide=(double) a/b;


        return divide;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String flag="Y";
        while (flag.equals("Y")){

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
                int result=obj.sub(a,b);
                System.out.println("Sub is " + result);
            }else  if(choice==3){

                //call multiply logic
                int result=obj.multi(a,b);
                System.out.println("Multi is " + result);
            }else {

                // call divide logic
                double result= obj.divide(a,b);
                System.out.println("Divide is " + result);
            }


            System.out.println("Do you want to continue PRESS Y or press N or any other key to EXIT ....");
            Scanner scanner1= new Scanner(System.in);
            flag= scanner1.nextLine();

        }


    }
}
