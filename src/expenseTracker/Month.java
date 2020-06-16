package expenseTracker;

import expenseTracker.Category.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Month {
    String monthName;
    HashMap<String, Category> transactionCategoryMap;
    double totalSpent;
    public Month(String monthName) {
        totalSpent = 0;
        this.monthName = monthName;
        transactionCategoryMap = new HashMap<String, Category>();
        setUpTransactionCategoryMap();
    }
    private void setUpTransactionCategoryMap() {
        transactionCategoryMap.put("Eating Out", new EatingOut());
        transactionCategoryMap.put("Pets", new Pets());
        transactionCategoryMap.put("Bills", new Bills());
        transactionCategoryMap.put("Entertainment", new Entertainment());
        transactionCategoryMap.put("Expenses", new Expenses1X());
        transactionCategoryMap.put("Material", new Material());
        transactionCategoryMap.put("Groceries", new Groceries());
        transactionCategoryMap.put("Home improvement", new HomeImprovement());
        transactionCategoryMap.put("Donations", new Donations());

    }
    public void addCategory(Category category) {
        transactionCategoryMap.put(category.getCategoryName(), category);
    }
    public double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent+=totalSpent;
    }

    public double getCategoryTotalCost(String category) {
        Category getTotal = transactionCategoryMap.get(category);
        return getTotal.getTotalSpent();
    }

    public String getMostExpensiveCategory(){
        double maxSpent = 0;
        String maxName = "";
        for(String k : transactionCategoryMap.keySet()) {
            if((transactionCategoryMap.get(k)).getTotalSpent() > maxSpent) {
                maxSpent = (transactionCategoryMap.get(k)).getTotalSpent();
                maxName = k;
            }
        }
        return maxName;
    }

}
