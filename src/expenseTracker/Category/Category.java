package expenseTracker.Category;

import java.util.Date;

public abstract class Category {

    protected String transactionName;
    protected static double totalTransactionCosts;
    protected double transactionCost;
    protected Date transactionDate;
    protected double budget;
    protected String categoryName;

    Category(double transactionCost, String transactionName){
        this.transactionCost = transactionCost;
        this.transactionName = transactionName;
        this.totalTransactionCosts+=transactionCost;
    }
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
    void displayCategoryName() {
        System.out.println(categoryName);
    }
    public String getCategoryName() {
        return categoryName;
    }
}
