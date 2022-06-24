package class_and_object;

public class CalculatorParameter {

    //: access_specifier return_type  method_name (Datatype varName, Datatype varName,.........) {}

    public void addtion(int a, int b){

        int sum=a+b;

        System.out.println("SUM is "+sum);
    }

    public static void main(String[] args) {

        CalculatorParameter obj = new CalculatorParameter();
        obj.addtion(34,327);
    }

}
