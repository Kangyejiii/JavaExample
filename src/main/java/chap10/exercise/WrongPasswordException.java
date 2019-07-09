package chap10.exercise;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() { }

    public WrongPasswordException(String message) {
        super(message);
    }
}
