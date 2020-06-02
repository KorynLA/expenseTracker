package test;

import expenseTracker.Expense;
import org.junit.Test;
import org.junit.Assert;

import java.time.Month;
import java.time.Year;

public class ExpenseTest {
    @Test
    public void testAmount() {
        double testAmounts = 20.25;
        Expense testValues = new Expense("Test", Month.JUNE, Year.now(), testAmounts);
        //Allowing 1 cent change between values, without delta the method is deprecated
        Assert.assertEquals("The amount given to the object is incorrect", testValues.getAmount(), testAmounts, 0.01);
    }

}
