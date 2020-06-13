package expenseTracker;

import java.util.HashMap;
import java.util.List;

public interface Year {

    int year=2020;
    HashMap<String, Month> mapMonths();
    double getTotalSpent();
    void setTotalSpent();
    void displayItemCosts();
    double getCategoryTotalCost();
    String getMostExpensiveMonth();
    String getMostExpensiveCategory();
    double categoryTotalCostPercentage();
}
