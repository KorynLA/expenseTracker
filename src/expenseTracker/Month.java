package expenseTracker;

import expenseTracker.Category.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Month {
    String monthName;
    HashMap<String, Category> transactionCategoryMap;
    double totalSpent;
    Month(String monthName) {
        totalSpent = 0;
        this.monthName = monthName;
        transactionCategoryMap = new HashMap<String, Category>();
        setUpTransactionCategoryMap();
    }
    private void setUpTransactionCategoryMap() {
        transactionCategoryMap.put("eatingout", new EatingOut());
        transactionCategoryMap.put("pets", new Pets());
        transactionCategoryMap.put("bills", new Bills());
        transactionCategoryMap.put("entertainment", new Entertainment());
        transactionCategoryMap.put("expenses", new Expenses1X());
        transactionCategoryMap.put("material", new Material());
        transactionCategoryMap.put("groceries", new Groceries());
        transactionCategoryMap.put("homeimprovement", new HomeImprovement());
        transactionCategoryMap.put("donations", new Donations());

    }
    double getTotalSpent() {
        return totalSpent;
    }

    void setTotalSpent(Integer totalSpent) {
        this.totalSpent+=totalSpent;
    }

    double getCategoryTotalCost(String category) {
        Category getTotal = transactionCategoryMap.get(category);
        return getTotal.getTotalSpent();
    }


    String getMostExpensiveCategory(){
        double maxSpent = 0;
        String maxName;
        transactionCategoryMap.forEach((k, v) ->if(v.getTotalSpent() > maxSpent) {
            maxSpent = v.getTotalSpent();
            maxName = v.getCategoryName();
        });
    }

}
