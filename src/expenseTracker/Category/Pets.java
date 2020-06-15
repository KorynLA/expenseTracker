package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Pets extends Category {

    public Pets(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Pets";
    }

}
