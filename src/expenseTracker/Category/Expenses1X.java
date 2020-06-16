package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Expenses1X extends Category {

    /*
     * Default subclass constructor to create the object.
     */
    public Expenses1X() {
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Expenses";
    }
}
