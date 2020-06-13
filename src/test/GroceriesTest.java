package test;
import expenseTracker.Category.Groceries;
import org.junit.Assert;
import org.junit.Test;

public class GroceriesTest {
    @Test
    public void testAmount() {
        double testAmounts = 12.25;
        Groceries testValues = new Groceries(testAmounts, "Safeway");
        //Allowing 1 cent change between values, without delta the method is deprecated
        Assert.assertEquals("The amount given to the object is incorrect", testValues.getTransactionCost(), testAmounts, 0.01);
        Assert.assertEquals("Total spent is not initial amount(First object created)",testValues.getTotalSpent(), testAmounts,.01);


        double testAmounts2 = 13.25;
        Groceries testValues2 = new Groceries(testAmounts2, "Fred Meyer");
        //Testing newly created object
        Assert.assertEquals("The amount given to the object is incorrect", testValues2.getTransactionCost(), testAmounts2, 0.01);
        //Testing static variable to see if changed when second object is created
        Assert.assertEquals("Total spent is not equal between tests",testValues.getTotalSpent(), testValues2.getTotalSpent(),.01);
        Assert.assertEquals("Total spent is not equal between object and total spent",testValues.getTotalSpent(), testAmounts+testAmounts2,.01);
    }
}
