package expenseTracker.Category;

import expenseTracker.Category.Category;

public class Pets extends Category {

    public Pets(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Pets";
    }

}
