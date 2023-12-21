package ExceptionWithCasketWithoutCasket;

public class AdultMovieClient {
    public static void main(String[]args){
        try{
            AdultMoviesController ac = new AdultMoviesController();
            ac.adultMoviesrepo(19);

        }catch (AgeException e){
            System.out.println(e.getErrorCode().toString()+" "+e.getMessage());

        }
    }
}
