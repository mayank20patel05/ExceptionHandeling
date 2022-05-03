package guestbook;

public class GuestBookFullException extends RuntimeException{
    public GuestBookFullException(String message) {
        super(message);
    }
}
