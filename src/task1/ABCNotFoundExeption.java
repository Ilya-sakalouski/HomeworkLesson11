package src.task1;

public class ABCNotFoundExeption extends Exception{
    @Override
    public String getMessage() {
        return "abc not found!!!";
    }
}
