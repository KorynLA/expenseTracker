package expenseTracker;

public class Groceries extends Category {
    public Groceries(double transactionCost, String transactionName){
        this.transactionCost = transactionCost;
        this.transactionName = transactionName;
        this.totalTransactionCosts+=transactionCost;
    }
}
