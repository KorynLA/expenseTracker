package test;
import expenseTracker.Category.Groceries;
import expenseTracker.Transaction;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class GroceriesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAmount() {
        double testAmounts = 12.25;
        Groceries testValues = new Groceries();
        testValues.addTransaction(new Transaction(testAmounts, "Fred Meyer", "05-20-2020"));
        //Allowing 1 cent change between values, without delta the method is deprecated
        Assert.assertEquals("Total spent is not initial amount(First object created)",testValues.getTotalSpent(), testAmounts,.01);
        testValues.displayTransactions();
        String getDisplay = " Transaction Name: Fred Meyer Cost: "+ testAmounts;
        //Assert.assertEquals(getDisplay, outContent.toString());


        double testAmounts2 = 13.25;
        testValues.addTransaction(new Transaction(testAmounts2, "winco", "05-20-2020"));
        //Testing newly created object
        Assert.assertEquals("Total spent is not equal between object and total spent",testValues.getTotalSpent(), testAmounts+testAmounts2,.01);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
