package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Donations extends Category{
    public Donations(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Donations";
    }
}
