package it.poliba.sisinflab.programmazioneB.basic;

public class CreditCard {
    private String customer;      // name of the customer (e.g., "John Bowman")
    private String bank;          // name of the bank (e.g., "California Savings")
    private String account;       // account identifier (e.g., "5391 0375 9387 5309")
    private int limit;            // credit limit (measured in dollars)
    protected double balance;     // current balance (measured in dollars)

    public CreditCard(String cust, String bank, String acnt, int lim, double initialBal) {
        this.customer = cust;
        this.bank = bank;
        this.account = acnt;
        this.limit = lim;
        this.balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);               // use a balance of zero as default
    }

    public String getCustomer() {
        return this.customer;
    }

    public String getBank() {
        return this.bank;
    }

    public String getAccount() {
        return this.account;
    }

    public int getLimit() {
        return this.limit;
    }

    public double getBalance() {
        return this.balance;
    }

    /**
     * Charges the given price to the card, assuming sufficient credit limit.
     * @param price  the amount to be charged
     * @return true  if charge was accepted; false if charge was denied
     */
    public boolean charge(double price) {               // make a charge
        if (price + this.balance > this.limit)                      // if charge would surpass limit
            return false;                                   // refuse the charge
        // at this point, the charge is successful
        this.balance += price;                                 // update the balance
        return true;                                      // announce the good news
    }

    /**
     * Processes customer payment that reduces balance.
     * @param amount the amount of payment made
     */
    public void makePayment(double amount) {
        // make a payment
        this.balance -= amount;
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);  // implicit cast
        System.out.println("Limit = " + card.limit);      // implicit cast
    }

}



