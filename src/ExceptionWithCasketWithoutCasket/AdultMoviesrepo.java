package ExceptionWithCasketWithoutCasket;


public class AdultMoviesrepo {


    public int adultMoviesrepo(int age){

        int existingage=18;

        if (age>=18){
           System.out.println("Allow to movie");
            return existingage;

        }else {
            throw new AgeException(ErrorCode.INVALID_AGE.toString()," ");
        }

    }
}
