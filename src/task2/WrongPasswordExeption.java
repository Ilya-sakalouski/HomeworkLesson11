package src.task2;

public class WrongPasswordExeption extends Exception {

    public WrongPasswordExeption(String message) {
        super(message);
    }

    public WrongPasswordExeption() {
    }

    @Override
    public String getMessage() {
        return "Wrong password !!!";
    }
}
