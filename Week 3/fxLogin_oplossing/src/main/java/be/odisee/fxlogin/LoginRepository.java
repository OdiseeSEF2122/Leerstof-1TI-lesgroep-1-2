package be.odisee.fxlogin;

import java.util.HashMap;
import java.util.Map;

public class LoginRepository {
    /*private static final Map<String, String> accounts=new HashMap<String, String>() {
        {
            put("devil", "666");
        }
    };*/
    private static final Map<String, String> accounts= Map.of("RobertMartin","UncleBob", "a", "b");

    static boolean isCorrectCreditentials(String login, String password) {
        String savedPassword=accounts.get(login);
        if (savedPassword != null && savedPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
