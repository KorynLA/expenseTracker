package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HomeImprovement extends Category{
    List<Transaction> homeImprovementTransaction;
    public HomeImprovement(){
        homeImprovementTransaction = new ArrayList<Transaction>();
        categoryName = "homeImprovement";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        homeImprovementTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < homeImprovementTransaction.size(); i++) {
            homeImprovementTransaction.get(i).displayItemsAndCosts();
        }
    }
}
