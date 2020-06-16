package expenseTracker;

public class Transaction {
    protected String transactionName;
    protected double transactionCost;
    protected String transactionDate;

    public Transaction(double transactionCost, String transactionName, String transactionDate) {
        this.transactionName = transactionName;
        this.transactionCost = transactionCost;
        this.transactionDate = transactionDate;
    }
    public String getTransactionName() {
        return transactionName;
    }

    public double getTransactionCost() {
        return transactionCost;
    }

    public void displayItemsAndCosts() {
        System.out.println("Transaction Name: "+transactionName+" Cost: "+ transactionCost);
    }
    public void setTransactionCost(double transactionCost) {
        this.transactionCost = transactionCost;
    }
    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
    public String getDate() {
        return transactionDate;
    }
}
