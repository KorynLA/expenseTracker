package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Bills extends Category{

    public Bills(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Donations";
    }
}
