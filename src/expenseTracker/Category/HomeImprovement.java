package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HomeImprovement extends Category {

    /*
    * Default subclass constructor to create the object.
    */
    public HomeImprovement(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Home Improvement";
    }
}
