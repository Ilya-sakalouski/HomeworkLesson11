package src.task2;

public class WrongLoginExeption extends Exception {

    public WrongLoginExeption(String message) {
        super(message);
    }

    public WrongLoginExeption() {
    }

    @Override
    public String getMessage() {
        return "Wrong login !!!";
    }
}
