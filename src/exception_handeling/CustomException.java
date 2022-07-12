package exception_handeling;

public class CustomException {

    public void checkEligibilty(int age) throws AgeNotElligible {

        if(age>=18){

            System.out.println("Eligible for voting");
        }
        else {

          throw new AgeNotElligible("Age is less than 18");
        }

    }
    public static void main(String[] args) {

        CustomException obj = new CustomException();
        try {
            obj.checkEligibilty(17);
        } catch (AgeNotElligible ageNotElligible) {
            ageNotElligible.printStackTrace();
        }

    }
}
