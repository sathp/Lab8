/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings Account.
         */
        CHECKINGS,
        /**
         * Savings Account.
         */
        SAVINGS,
        /**
         * Student Account.
         */
        STUDENT,
        /**
         * Workplace Account.
         */
        WORKPLACE
    }

   /**
    * Account Number.
    */
    private int accountNumber;
    /**
     * Account Type.
     */
    private BankAccountType accountType;
    /**
     * Account Balance.
     */
    private double accountBalance;
    /**
     * Owner Name.
     */
    private String ownerName;
    /**
     * Interest Rate.
     */
    private double interestRate;
    /**
     * Interest Earned.
     */
    private double interestEarned;

    /**
     * Random Integer.
     */
    private final int randInt = 10000;
    /**
     * Random Double.
     */
    private final double randD = 1.5;
    /**
     * Random Double 2.
     */
    private final double randD2 = 105.5;

    /**
     * Creates a bank account.
     * @param name - Owner's Name
     * @param accountCategory - Type of Account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        interestRate = randD;
        interestEarned = randD2;
        accountBalance = randInt;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * @return accountType
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }
    /**
     * @return getaccountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * @return getownerName
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * @return getinterestRate
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * @return getinterestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * @param a - account number.
     */
    public void setAccountNumber(final int a) {
         accountNumber = a;
    }
    /**
     * @param b is the Bank Account Type.
     */
    public void setBankAccountType(final BankAccountType b) {
        accountType = b;
    }
    /**
     * @param p is amount.
     */
    public void setaccountBalance(final double p) {
        accountBalance = p;
    }
    /**
     * @param n is the name.
     */
    public void setownerName(final String n) {
        ownerName = n;
    }
    /**
     * @param i is the interest rate.
     */
    public void setinterestRate(final double i) {
        interestRate = i;
    }
    /**
     * @param n is the interest earned.
     */
    public void setinterestEarned(final double n) {
        interestEarned = n;
    }
}
