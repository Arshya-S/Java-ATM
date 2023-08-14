import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private String name;
    private ArrayList<Account> accounts;
    private ArrayList<User> users;

    public String getNewUserUUID() {
        String uuid;

        Random rng = new Random();

        return uuid;
    }

    public String getNewAccountUUID() {
        return null;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
