package expenseTracker;

public class Transaction {
    private String transactionName;
    private double transactionCost;
    private String transactionDate;

    public Transaction(double transactionCost, String transactionName, String transactionDate) throws IllegalArgumentException {
        if(transactionName.equals("")) {
            throw new IllegalArgumentException("Invalid transaction name");
        }
        if(transactionCost == 0) {
            throw new IllegalArgumentException("Invalid transaction cost");
        }
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
