package conditional_statements;

public class ANDConditionalStatements {

    public static void main(String[] args) {

        //SYNTAX if(condition1 LOGICAL_OPERATOR condition2  LOGICAL OPERATOR condition3... )

        int age=19;
        String city="AGRA";
//1.AND -->  &  :  TRUE & TRUE= TRUE (1X1=1)

        if(age>18 & city=="AGRA" ){
            System.out.println("Eligible for voting in Agra ");

        }
        else {
            System.out.println("NOT Eligible for voting in Agra ");
        }
//TRUE & FALSE=FALSE(1X0=0)

        if(age>18 & city=="DELHI" ){
            System.out.println("Eligible for voting in Agra ");

        }
        else {
            System.out.println("NOT Eligible for voting in Agra ");
        }
//FALSE & TRUE =FALSE(0X1=0)

        if(age>20 & city=="AGRA" ){
            System.out.println("Eligible for voting in Agra ");

        }
        else {
            System.out.println("NOT Eligible for voting in Agra ");
        }
//FALSE&FALSE= FALSE(0X0=0)

        if(age>20 & city=="DELHI" ){
            System.out.println("Eligible for voting in Agra ");

        }
        else {
            System.out.println("NOT Eligible for voting in Agra ");
        }

    }
}
