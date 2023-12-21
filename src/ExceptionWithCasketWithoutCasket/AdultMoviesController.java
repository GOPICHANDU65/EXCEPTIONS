package ExceptionWithCasketWithoutCasket;

public class AdultMoviesController {
    public int adultMoviesrepo(int age) {
        AdultMoviesService as = new AdultMoviesService();
     return as.adultMoviesrepo(age);
    }
}