package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Bills extends Category{
    List<Transaction> billsTransaction;

    public Bills(){
        billsTransaction = new ArrayList<Transaction>();
        categoryName = "Donations";
    }
    public void setBillsTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        billsTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < billsTransaction.size(); i++) {
            billsTransaction.get(i).displayItemsAndCosts();
        }
    }
}
