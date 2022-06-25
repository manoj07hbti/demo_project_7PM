package class_and_object;

public class CalCReturnType {


    public int add(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public double divide(int a, int b){

        double divide=(double) a/b;


        return divide;
    }

    public static void main(String[] args) {
        CalCReturnType obj = new CalCReturnType();
        int result = obj.add(3, 8);// store result

        System.out.println("Addition is " + result);

       double divide = obj.divide(6,5);
       System.out.println("Divide of a and b is "+divide);

    }
}
