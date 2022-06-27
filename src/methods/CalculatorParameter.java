package methods;

public class CalculatorParameter {

    //: access_specifier return_type  method_name (Datatype varName, Datatype varName,.........) {}

    public void addition(int a, int b){

        int sum=a+b;

        System.out.println("SUM is "+sum);
    }

    public static void main(String[] args) {

        CalculatorParameter obj = new CalculatorParameter();
        obj.addition(34,327);
    }

}
