package expenseTracker;

import java.util.Date;

public class Transaction {
    protected String transactionName;
    protected double transactionCost;
    protected Date transactionDate;

    public String getTransactionName() {
        return transactionName;
    }

    public double getTransactionCost() {
        return transactionCost;
    }

    public void displayItemsAndCosts() {
        System.out.println("Transaction Name: "+transactionName+" Cost: "+ transactionCost);
    }

    public double getDate() {
        return transactionDate;
    }
}