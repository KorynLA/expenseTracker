package expenseTracker;

public class Transaction {
    private String transactionName;
    private double transactionCost;
    private String transactionDate;

    /*
     * Default constructor. Ensures the values passed are allowed.
     */
    public Transaction(double transactionCost, String transactionName, String transactionDate) {
        setTransactionName(transactionName);
        setTransactionCost(transactionCost);
        this.transactionDate = transactionDate;
    }

    /*
     * A getter function that returns the name of the transaction
     * Params: None
     * Return: The name as a string value
     */
    public String getTransactionName() {
        return transactionName;
    }

    /*
     * A getter function that returns the cost of the transaction
     * Params: None
     * Return: The transaction as a double
     */
    public double getTransactionCost() {
        return transactionCost;
    }

    /*
     * A display function that prints the transaction name and cost
     * Params: None
     * Return: None
     */
    public void displayItemsAndCosts() {
        System.out.println("Transaction Name: "+transactionName+" Cost: "+ transactionCost);
    }

    /*
     * A setter function that changes the cost of the transaction
     * Params: The cost of the transaction as a double value.
     * Return: None
     */
    public void setTransactionCost(double transactionCost) throws IllegalArgumentException{
        if(transactionCost == 0) {
            throw new IllegalArgumentException("Invalid transaction cost");
        }
        this.transactionCost = transactionCost;
    }

    /*
     * A setter function that changes the name of the transaction
     * Params: The name of the transaction as a string.
     * Return: None
     */
    public void setTransactionName(String transactionName) throws IllegalArgumentException{
        if(transactionName.equals("")) {
            throw new IllegalArgumentException("Invalid transaction name");
        }
        this.transactionName = transactionName;
    }

    /*
     * A getter function that returns the date of the transaction
     * Params: None
     * Return: The date as a string value
     */
    public String getDate() {
        return transactionDate;
    }
}
