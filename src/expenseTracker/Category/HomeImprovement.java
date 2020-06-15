package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HomeImprovement extends Category{
    public HomeImprovement(){
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "homeImprovement";
    }
}
