package src.task2;

public class Task2 {
    public static void informationCheck(String login, String password, String confirmPassword) {
        try {
            if ((login.length() > 20) || (login.matches(" ")))
                throw new WrongLoginExeption();

            if ((password.length() > 20) || (password.matches(" ") || (password.matches("[0-9]"))))
                throw new WrongPasswordExeption();

            if (!password.equals(confirmPassword))
                throw new WrongPasswordExeption();

        } catch (WrongLoginExeption e) {
            e.getMessage();
            throw new RuntimeException(e);
        } catch (WrongPasswordExeption e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }
}

