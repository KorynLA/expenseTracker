package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.List;

public abstract class Category {

    protected static double totalTransactionCosts;
    protected double budget;
    protected String categoryName;
    List<Transaction> categoryTransaction;

    /*
    * Default Super constructor. Constructors that will be used are from the subclasses.
    */
    Category() {}

    /*
    * A setter function that changes the budget of the Category
    * Params: The budget the user wants as a double value.
    * Return: None
    */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /*
    * A getter function that returns the budget of the Category
    * Params: None
    * Return: The budget as a double value
    */
    public double getBudget() {
        return budget;
    }

    /*
    * A getter function that returns the totalTransactionCosts of a Category
    * Params: None
    * Return: The totalTransactionCosts as a double
    */
    public double getTotalSpent() {
        return totalTransactionCosts;
    }

    /*
    * A display function that prints the Category name to the screen
    * Params: None
    * Return: None
    */
    public void displayCategoryName() {
        System.out.println(categoryName);
    }

    /*
     * A getter function that returns the name of a Category
     * Params: None
     * Return: The category name as a String
     */
    public String getCategoryName() {
        return categoryName;
    }

    /*
    * Adds the newest transaction to the category and updates the total transaction cost of the Category
    * Params: The transaction object
    * Return: None
    */
    public void addTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        categoryTransaction.add(transaction);
    }

    /*
     * A display function that prints the transaction name and cost of all transactions in the Category to the screen
     * Params: None
     * Return: None
     */
    public void displayTransactions() {
        for(int i=0; i < categoryTransaction.size(); i++) {
            categoryTransaction.get(i).displayItemsAndCosts();
        }
    }
}
