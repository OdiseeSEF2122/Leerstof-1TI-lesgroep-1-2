package be.odisee.huiswerk4;

/**
 * A financial account managed by a bank for making transactions
 */
public abstract class Account {

    protected double balance;  //The current balance. use Currency for real life financial operations
    private final int accountNumber;  //The account number
    private static int nextAccountNbr = 0; // the account number used for the next instantiated account

    /**
     * Creates a new account with the next available account number
     */
    public Account() {
        balance = 0;
        accountNumber = nextAccountNbr;
        nextAccountNbr += 1;
    }

    /**
     * deposit an amount to increase the balance
     * @param amount positive non zero amount to add
     */
    public void deposit(final double amount) {
        if (amount>=0) {
            balance += amount;
        } else {
            System.err.println("Account.deposit(...): cannot deposit negative amount.");
        }
    }

    /**
     * withdraw an amount decreasing the balance
     * @param amount positive amount, not larger than the balance
     */
    public void withdraw(final double amount) {
        if(amount< 0){
            System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
            //or throw exception
            return;
        }

        if (amount<=balance) {
            balance -= amount;
        } else {
            System.err.println("Cannot withdraw money that is not present");
            //or throw exception
        }
    }

    /**
     * yearly routine to maintain the account specified by the specific account type
     */
    public abstract void update();

    /**
     * Current balance
     * @return Current balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * The unique account number tied to this account
     * @return account number
     */
    public double getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * String representation of an account
     * @return
     */
    public String toString()
    {
        return "Account number " + accountNumber + ": " + "balance = " + balance;
    }

    /**
     * Print a representation of an account to the output stream
     */
    public final void print()
    {
        System.out.println( toString() );
    }

}
