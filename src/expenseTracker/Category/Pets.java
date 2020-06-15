package expenseTracker.Category;

import expenseTracker.Category.Category;
import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Pets extends Category {

    List<Transaction> petsTransaction;
    public Pets(){
        petsTransaction = new ArrayList<Transaction>();
        categoryName = "Pets";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        petsTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < petsTransaction.size(); i++) {
            petsTransaction.get(i).displayItemsAndCosts();
        }
    }

}
