package student.exception;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String errorMessage, Throwable e) {
        super(errorMessage, e);
    }

}
