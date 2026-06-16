public interface ATMOperations {

    void deposit(double amount) throws InvalidAmountException;

    void withdraw(double amount)
            throws InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}