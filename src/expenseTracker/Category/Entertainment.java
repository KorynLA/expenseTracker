package expenseTracker.Category;

import expenseTracker.Category.Category;

public class Entertainment extends Category {
    public Entertainment(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Entertainment";
    }
}
