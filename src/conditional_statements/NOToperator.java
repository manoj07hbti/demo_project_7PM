package conditional_statements;

public class NOToperator {

    public static void main(String[] args) {

//NOT---> !   !(TRUE)= FALSE
//		    !(FALSE)=TRUE

        int age=19;

        if(!(age>18)){

            System.out.println("Eligible for voting ....");
        }
        else {
            System.out.println("NOT Eligible for voting ....");
        }

        String city="AGRA";

        if( !(city=="DELHI")){
            System.out.println("You are in Delhi ....");
        }
        else{
            System.out.println("You are NOT in Delhi ....");
        }

    }
}
