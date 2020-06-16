package test;

import expenseTracker.Transaction;
import org.junit.Assert;
import org.junit.Test;

public class TransactionTest {

    final String name1 = "Winco";
    final double cost1 = 15.5;
    final String date1 = "05-20-2020";
    final double cost2 = 10.23;

    /*
     * Test to create a transaction object. Compares that the variables within the transaction are correct.
     */
    @Test
    public void transactionTest1() {
        Transaction transaction1 = new Transaction(cost1, name1, date1);
        Assert.assertEquals(transaction1.getTransactionName(), name1);
        Assert.assertEquals(transaction1.getTransactionCost(), cost1, .01);
        Assert.assertEquals(transaction1.getDate(), date1);
    }
    /*
     * Test to compare the setTransactionCost method. Tests that the transaction cost has been updated and no other
     * variable values have been changed.
     */
    @Test
    public void transactionTest2() {
        Transaction transaction1 = new Transaction(cost1, name1, date1);
        transaction1.setTransactionCost(cost2);
        Assert.assertEquals(transaction1.getTransactionCost(), cost2, .01);
        Assert.assertEquals(transaction1.getDate(), date1);
        Assert.assertEquals(transaction1.getTransactionName(), name1);
    }
    /*
     * Test to compare the setTransactionName method. Tests that the transaction name has been updated and no other
     * variable values have been changed.
     */
    @Test
    public void transactionTest3() {
        Transaction transaction1 = new Transaction(cost1, name1, date1);
        transaction1.setTransactionName("");
        Assert.assertEquals(transaction1.getTransactionName(), "");
        Assert.assertEquals(transaction1.getTransactionCost(), cost1, .01);
        Assert.assertEquals(transaction1.getDate(), date1);
    }
}
