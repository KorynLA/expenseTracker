package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Entertainment extends Category {

    /*
     * Default subclass constructor to create the object.
     */
    public Entertainment(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Entertainment";
    }
}
