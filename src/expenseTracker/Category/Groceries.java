package expenseTracker.Category;

import expenseTracker.Category.Category;

public class Groceries extends Category {
    public Groceries(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Groceries";
    }
}
