package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Donations extends Category {

    /*
     * Default subclass constructor to create the object.
     */
    public Donations(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Donations";
    }
}
