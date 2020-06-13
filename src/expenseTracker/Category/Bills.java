package expenseTracker.Category;

public class Bills extends Category{
    public Bills(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Bills";
    }
}
