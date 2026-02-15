package disaster_relief;

@SuppressWarnings("serial")
public class InsufficientResourceException extends Exception {

    public InsufficientResourceException(String message) {
        super(message);
    }
}
