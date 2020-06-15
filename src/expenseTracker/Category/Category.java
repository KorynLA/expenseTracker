package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.Date;
import java.util.List;

public abstract class Category {

    protected static double totalTransactionCosts;
    protected double budget;
    protected String categoryName;
    List<Transaction> categoryTransaction;

    Category() {}

    public void setBudget(double budget) {
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }
    public double getTotalSpent() {
        return totalTransactionCosts;
    }

    public void displayCategoryName() {
        System.out.println(categoryName);
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void addTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        categoryTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < categoryTransaction.size(); i++) {
            categoryTransaction.get(i).displayItemsAndCosts();
        }
    }
}
