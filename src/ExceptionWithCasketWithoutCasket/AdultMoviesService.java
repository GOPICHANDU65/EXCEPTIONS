package ExceptionWithCasketWithoutCasket;

public class AdultMoviesService {
    public int adultMoviesrepo(int age){
  int  ages;

        try {
            AdultMoviesrepo ad=new AdultMoviesrepo();
            ages=ad.adultMoviesrepo(age);
        }catch (AgeException e){
         System.out.println(" you are not allowed to watch movie " + e.getMessage());
         throw e;
        }
      return ages;
    }
}
