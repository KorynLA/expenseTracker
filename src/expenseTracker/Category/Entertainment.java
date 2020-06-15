package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Entertainment extends Category {
    List<Transaction> entertainmentTransaction;
    public Entertainment(){
        entertainmentTransaction = new ArrayList<Transaction>();
        categoryName = "entertainment";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        entertainmentTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < entertainmentTransaction.size(); i++) {
            entertainmentTransaction.get(i).displayItemsAndCosts();
        }
    }
}
