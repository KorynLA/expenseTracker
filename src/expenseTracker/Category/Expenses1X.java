package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Expenses1X extends Category{
    List<Transaction> expenses1XTransaction;
    public Expenses1X(){
        expenses1XTransaction = new ArrayList<Transaction>();
        categoryName = "expense1X";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        expenses1XTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < expenses1XTransaction.size(); i++) {
            expenses1XTransaction.get(i).displayItemsAndCosts();
        }
    }
}
