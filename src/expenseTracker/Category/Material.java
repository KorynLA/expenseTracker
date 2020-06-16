package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Material extends Category {
    public Material() {
        categoryTransaction = new ArrayList<Transaction>();
        categoryName = "Material";
    }
}
