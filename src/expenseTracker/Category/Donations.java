package expenseTracker.Category;

public class Donations extends Category{
    public Donations(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Donations";
    }
}
