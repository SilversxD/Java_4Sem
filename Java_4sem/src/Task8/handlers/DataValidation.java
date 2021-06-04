package Task8.handlers;

import Task8.AuthUser;
import Task8.FakeServer;

/**
 * Обработчик для проверки логина и пароля
 */
public class DataValidation extends Base {
    private final FakeServer server;

    public DataValidation(FakeServer server) {
        this.server = server;
    }

    @Override
    public boolean check(AuthUser user) {
        if (!server.doesExist(user.getLogin())) {
            System.out.println("User with this login wasn't found");
            return false;
        }
        if (!server.isPasswordCorrect(user.getLogin(), user.getPassword())) {
            System.out.println("Password is incorrect");
            return false;
        }
        return checkNext(user);
    }
}
