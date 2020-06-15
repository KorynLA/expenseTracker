package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Expenses1X extends Category {

    public Expenses1X() {
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "expense1X";
    }
}
