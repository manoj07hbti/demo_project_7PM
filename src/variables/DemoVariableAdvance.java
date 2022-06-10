package variables;

public class DemoVariableAdvance {

    public static void main(String[] args) {

        // declaration  Datatype varName;

        String name;

        // assignment varName=Value;
        name="Raj";

        System.out.println("Printing variable "+name);
        // we can reuse variable to store different
        name="Rahul";
        System.out.println("Printing variable after changing data  "+name);

        // variable manipulation add , subtract , divide multiply
        // add = var1+var2;  sub= var1-var2;  divide =var1/var2; multi= var1*var2;

        int a=10;
        int b=2;

        //addition

        System.out.println("Printing SUM " +(a+b));
        System.out.println("Printing SUB " +(b-a));
        System.out.println("Printing Divide " +(a/b));
        System.out.println("Printing Multi " +(a*b));

        int result;// declaring variable as int

        result=a+b;
        System.out.println("Printing SUM using result " +result);

        result=a-b;
        System.out.println("Printing SUB using result " +result);

        result=a/b;
        System.out.println("Printing DIVIDE using result " +result);

        result=a*b;
        System.out.println("Printing multiply  using result " +result);



    }
}
