package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class EatingOut extends Category{
    List<Transaction> eatingOutTransaction;
    public EatingOut(){
        eatingOutTransaction = new ArrayList<Transaction>();
        categoryName = "eatingOut";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        eatingOutTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < eatingOutTransaction.size(); i++) {
            eatingOutTransaction.get(i).displayItemsAndCosts();
        }
    }
}
