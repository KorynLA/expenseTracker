package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Groceries extends Category {
    public Groceries(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "groceries";
    }
}
