package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class EatingOut extends Category {

    /*
     * Default subclass constructor to create the object.
     */
    public EatingOut(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Eating Out";
    }
}
