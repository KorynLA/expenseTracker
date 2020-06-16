package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Bills extends Category {

    /*
     * Default subclass constructor to create the object.
     */
    public Bills(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Bills";
    }
}
