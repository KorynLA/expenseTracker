package expenseTracker.Category;

public class HomeImprovement extends Category{
    public HomeImprovement(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Home Improvement";
    }
}
