package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Entertainment extends Category {
    public Entertainment(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Entertainment";
    }
}
