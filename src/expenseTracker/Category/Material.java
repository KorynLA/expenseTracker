package expenseTracker.Category;

import expenseTracker.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Material extends Category{
    List<Transaction> materialTransaction;
    public Material(){
        materialTransaction = new ArrayList<Transaction>();
        categoryName = "Material";
    }
    public void setTransaction(Transaction transaction) {
        totalTransactionCosts+=transaction.getTransactionCost();
        materialTransaction.add(transaction);
    }
    public void displayTransaction() {
        for(int i=0; i < materialTransaction.size(); i++) {
            materialTransaction.get(i).displayItemsAndCosts();
        }
    }
}
