package chap10.exercise;

public class NotExistIDException extends Exception {
    public NotExistIDException() { }

    public NotExistIDException(String message) {
        super(message);
    }
}
