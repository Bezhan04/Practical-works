package student.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message, Throwable e) {
        super(message, e);

    }
}