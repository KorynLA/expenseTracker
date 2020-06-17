package test;

import expenseTracker.Transaction;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TransactionTest {
    final String name1 = "Winco";
    final String name2 = "Phone";
    final String name3 = "Cat food";
    final double cost1 = 15.5;
    final double cost3 = 13.4;
    final String date1 = "05-20-2020";
    final String date2 = "05-21-2020";
    final String date3 = "05-22-2020";
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
    public void transactionTest3() {
        Transaction transaction1 = new Transaction(cost1, name1, date1);
        transaction1.setTransactionName("Glasses");
    }
    /*
    * Test to create multiple objects (3). Ensures that all objects have the correct variable values associated with them.
     */
    @Test
    public void transactionTest4() {
        Transaction transaction1 = new Transaction(cost1, name1, date1);
        Transaction transaction2 = new Transaction(cost2, name2, date2);
        Transaction transaction3 = new Transaction(cost3, name3, date3);
        //Transaction 1 testing
        Assert.assertEquals(transaction1.getTransactionName(), name1);
        Assert.assertEquals(transaction1.getTransactionCost(), cost1, .01);
        Assert.assertEquals(transaction1.getDate(), date1);
        //Transaction 2 testing
        Assert.assertEquals(transaction2.getTransactionName(), name2);
        Assert.assertEquals(transaction2.getTransactionCost(), cost2, .01);
        Assert.assertEquals(transaction2.getDate(), date2);
        //Transaction 3 testing
        Assert.assertEquals(transaction3.getTransactionName(), name3);
        Assert.assertEquals(transaction3.getTransactionCost(), cost3, .01);
        Assert.assertEquals(transaction3.getDate(), date3);

    }
    /*
    * Test when null string is given as name
     */
    @Test(expected = NullPointerException.class)
    public void transactionTest5() {
        Transaction transaction1 = new Transaction(cost1, null, date1);
    }
    /*
     * Test when empty string is given as name
     */
    @Test(expected = IllegalArgumentException.class)
    public void transactionTest6() {
        Transaction transaction1 = new Transaction(cost1, "", date1);
    }
    /*
     * Test when null is given as cost
     */
    @Test(expected = IllegalArgumentException.class)
    public void transactionTest7() {
        Transaction transaction1 = new Transaction(0, name1, date1);
    }

}
