package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Donations extends Category{
    List<Transaction> donationsTransaction;
    public Donations(){
        donationsTransaction = new ArrayList<Transaction>();
        categoryName = "Donations";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        donationsTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < donationsTransaction.size(); i++) {
            donationsTransaction.get(i).displayItemsAndCosts();
        }
    }
}
