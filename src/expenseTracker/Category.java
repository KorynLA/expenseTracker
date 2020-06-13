package expenseTracker;

import java.util.Date;

abstract class Category {

    protected String transactionName;
    protected static double totalTransactionCosts;
    protected double transactionCost;
    protected Date transactionDate;
    protected double budget;

    Category(){}
    void setBudget(double budget) {
        this.budget = budget;
    }
    public double getTransactionCost() {
        return transactionCost;
    }
    public double getTotalSpent() {
        return totalTransactionCosts;
    }
    void setTotalSpent() {
        totalTransactionCosts+=transactionCost;
    }
    void displayItemsAndCosts() {
        System.out.println("Transaction Name: "+transactionName+" Cost: "+ transactionCost);
    }
}
