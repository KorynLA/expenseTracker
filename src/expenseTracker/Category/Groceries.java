package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Groceries extends Category {
    List<Transaction> groceriesTransaction;
    public Groceries(){
        groceriesTransaction = new ArrayList<Transaction>();
        categoryName = "groceries";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        groceriesTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < groceriesTransaction.size(); i++) {
            groceriesTransaction.get(i).displayItemsAndCosts();
        }
    }
}
