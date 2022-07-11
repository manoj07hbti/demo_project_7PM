package exception_handeling;

public class DemoException {
    //TODO : try {  CODE
    //            }
    //       catch (Exception e){
    //        }

    public int divide(int a, int b ){
        int result=0;
        System.out.println("******* inside divide method before division.....");

        try {
             result = a / b;
           }
        catch (Exception e){
            System.out.println("####################### Exception occurred #######"+e);
        }
        finally {

            System.out.println("THIS IS FINALLY BLOCK ");
        }

        System.out.println("******* inside divide method After division.....");
        return result;

    }

    public static void main(String[] args) {

        DemoException obj= new DemoException();
        System.out.println("******* inside Main method **********");
       int result= obj.divide(6,3);
       System.out.println("Division is "+result);
        System.out.println("******* after method call inside Main method **********");
    }

}
