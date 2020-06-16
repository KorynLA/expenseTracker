package test;

import expenseTracker.Category.Groceries;
import expenseTracker.Month;
import expenseTracker.Transaction;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonthTest {
    Month month;
    double testAmount1 = 12.25;
    double testAmount2 = 13.89;
    String grocery = "winco";
    String material = "shirt";
    String date = "09/20/2020";
    Transaction testTransaction1, testTransaction2;

    //Setup testing
    @Before
    //Test the adding transaction
    public void setUp() {
        testTransaction1 = new Transaction(testAmount1, grocery, date);
        Groceries testGrocer = new Groceries();
        testGrocer.addTransaction(testTransaction1);
        month = new Month("june");
        month.addCategory(testGrocer);
    }
    @Test
    public void monthTest1() {
        Assert.assertEquals(month.getCategoryTotalCost("Groceries"), testAmount1, .01);
    }
}
