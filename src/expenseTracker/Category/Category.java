package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.Date;

public abstract class Category {

    protected static double totalTransactionCosts;
    protected double budget;
    protected String categoryName;

    Category() {}

    void setBudget(double budget) {
        this.budget = budget;
    }
    public double getTotalSpent() {
        return totalTransactionCosts;
    }

    void displayCategoryName() {
        System.out.println(categoryName);
    }
    public String getCategoryName() {
        return categoryName;
    }
    public abstract void displayTransaction();
    public abstract void setTransaction(Transaction transaction);
}
