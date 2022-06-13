package conditional_statements;

public class ORoperator {

    public static void main(String[] args) {


        int age=19;
        String city="AGRA";
//OR----> ||  TRUE||TRUE= TRUE (1+1=1)

        if(age>18 || city=="AGRA"){

          System.out.println("Eligible for voting in Agra.....");
        }
        else {
            System.out.println("NOT Eligible for voting in Agra.....");
        }
// TRUE||FALSE=TRUE (1+0=1)

        if(age>18 || city=="DELHI"){

            System.out.println("Eligible for voting in Agra.....");
        }
        else {
            System.out.println("NOT Eligible for voting in Agra.....");
        }
//FALSE||TRUE=TRUE (0+1=1)
        if(age<18 || city=="AGRA"){

            System.out.println("Eligible for voting in Agra.....");
        }
        else {
            System.out.println("NOT Eligible for voting in Agra.....");
        }
// FALSE|| FALSE= FALSE(0+0=0)

        if(age<18 || city=="DELHI"){

            System.out.println("Eligible for voting in Agra.....");
        }
        else {
            System.out.println("NOT Eligible for voting in Agra.....");
        }

    }
}
