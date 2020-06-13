package expenseTracker.Category;

public class Material extends Category{
    public Material(double transactionCost, String transactionName){
        super(transactionCost, transactionName);
        categoryName = "Material Items";
    }
}
