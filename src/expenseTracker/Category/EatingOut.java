package expenseTracker.Category;

public class EatingOut extends Category{
    public EatingOut(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Eating out";
    }
}
