package expenseTracker;

import expenseTracker.Category.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Month {
    String monthName;
    HashMap<String, List<Category>> transactionCategoryMap;
    double totalSpent;
    Month(String monthName) {
        totalSpent = 0;
        this.monthName = monthName;
        transactionCategoryMap = new HashMap<String, List<Category>>();
        List<Bills> billsTransactions = new ArrayList<Bills>();
        List<Entertainment> entertainmentTransactions = new ArrayList<Entertainment>();
        transactionCategoryMap.put("bills", billsTransactions);
        transactionCategoryMap.put("entertainment", entertainmentTransactions);
    }

    double getTotalSpent() {
        return totalSpent;
    }

    void setTotalSpent(Integer totalSpent) {
        this.totalSpent+=totalSpent;
    }

    double getCategoryTotalCost(String category) {
        Category getTotal = (transactionCategoryMap.get(category))[0];
        return getTotal.getTotalSpent();
    }

/**
    String getMostExpensiveCategory(){
        double maxSpent = 0;
        String maxName;
        transactionCategoryMap.forEach((k, v) ->if(v[0] > maxSpent) {
            maxSpent = v[0];
            maxName = (transactionCategoryMap.get(k))[0].
        });
    }
**/
}
