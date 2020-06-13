package expenseTracker;

import java.util.Date;

abstract class Category {
    String transactionName;
    static double totalTransactionCosts;
    double transactionCost;
    Date transactionDate;
    double budget;

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
