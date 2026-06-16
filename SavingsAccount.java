public class SavingsAccount
        extends BankAccount
        implements ATMOperations {

    public SavingsAccount(int accountNumber,
                          String accountHolderName,
                          double balance) {

        super(accountNumber,accountHolderName,balance);
    }

    @Override
    public void deposit(double amount)
            throws InvalidAmountException {

        if (amount <= 0)
            throw new InvalidAmountException(
                    "Invalid Deposit Amount");

        balance += amount;
    }

    @Override
    public void withdraw(double amount)
            throws InvalidAmountException,
                   InsufficientBalanceException {

        if (amount <= 0)
            throw new InvalidAmountException(
                    "Invalid Withdrawal Amount");

        if (amount > balance)
            throw new InsufficientBalanceException(
                    "Insufficient Balance");

        balance -= amount;
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance : " + balance);
    }
}