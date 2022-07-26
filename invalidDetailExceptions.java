public class invalidDetailExceptions extends Exception{

    enum ExceptionType{
        ENTERED_INVALID, ENTERED_NULL
    }

    ExceptionType type;
    public invalidDetailExceptions(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}