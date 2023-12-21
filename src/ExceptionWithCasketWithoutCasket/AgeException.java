package ExceptionWithCasketWithoutCasket;

public class AgeException extends RuntimeException {
    private String ErrorCode;
    public AgeException( String age, String message){
        super(message);
      this.ErrorCode=age;
    }

    public String getErrorCode() {
        return ErrorCode;
    }
}
