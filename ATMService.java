import java.util.HashMap;

public class ATMService {

    HashMap<Integer, BankAccount> accounts =
            new HashMap<>();

    public void createAccount(int accNo, String name, double balance) {

    System.out.println("Accounts: " + accounts.keySet());

    if (accounts.containsKey(accNo)) {
        System.out.println("Account already exists");
        return;
    }

    accounts.put(accNo,
            new SavingsAccount(accNo, name, balance));

    System.out.println("Account Created Successfully");
}
}