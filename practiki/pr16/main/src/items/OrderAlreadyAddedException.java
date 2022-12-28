package items;

public class OrderAlreadyAddedException extends Throwable {
    public String getMessage() {
        return "Order already added!";

    }
}