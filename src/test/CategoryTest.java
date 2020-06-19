package test;
/*
* All test information can be found in the test plan
*/
import expenseTracker.Category.*;
import expenseTracker.Transaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CategoryTest {
    final String name1 = "Dummy";
    final String name2 = "test";
    final double cost1 = 30.21;
    final double cost2 = 22.5;
    final String date1 = "09/03/2019";
    final String date2 = "02/01/2019";
    Transaction transaction1;
    Transaction transaction2;

    public CategoryTest() {
        transaction1 = new Transaction(cost1, name1, date1);
        transaction2 = new Transaction(cost2, name2, date2);
    }
    @Test
    public void categoryTest1() {
        Bills testBills = new Bills();
        Assert.assertEquals(testBills.getCategoryName(), "Bills");
    }
    @Test
    public void categoryTest2() {
        Bills testBills = new Bills();
        testBills.addTransaction(transaction1);
        Assert.assertEquals(testBills.getTotalSpent(), cost1, .01);
        Assert.assertEquals(testBills.getCategoryName(), "Bills");
    }
    @Test
    public void categoryTest3() {
        Pets testPets = new Pets();
        testPets.addTransaction(transaction1);
        //Assert.assertEquals(testPets.getTotalSpent(), cost1, .01);
        //Assert.assertEquals(testPets.getCategoryName(), "Pets");
        testPets.addTransaction(transaction1);
        Assert.assertEquals(testPets.getTotalSpent(), cost1*2, .01);
        Assert.assertEquals(testPets.getCategoryName(), "Pets");

    }
    @Test
    public void categoryTest4() {
        Pets testPets = new Pets();
        Bills testBills = new Bills();
        testBills.addTransaction(transaction2);
        testPets.addTransaction(transaction1);
        //Test Bills Category
        Assert.assertEquals(testBills.getTotalSpent(), cost2, .01);
        Assert.assertEquals(testBills.getCategoryName(), "Bills");
        Assert.assertEquals(testBills.getTransactionLength(), 1, .01);
        //Test Pets Category
        Assert.assertEquals(testPets.getTotalSpent(), cost1, .01);
        Assert.assertEquals(testPets.getCategoryName(), "Pets");
        Assert.assertEquals(testPets.getTransactionLength(), 1, .01);
    }
    @Test
    public void categoryTest5() {
        Pets testPets = new Pets();
        Bills testBills = new Bills();

        testPets.addTransaction(transaction2);
        testBills.addTransaction(transaction1);
        testBills.addTransaction(transaction2);

        //Test Bills Category
        Assert.assertEquals(testBills.getTotalSpent(), transaction1.getTransactionCost()+transaction2.getTransactionCost(), .1);
        Assert.assertEquals(testBills.getCategoryName(), "Bills");
        Assert.assertEquals(testBills.getTransactionLength(), 2, .1);

        //Test Pets Category
        Assert.assertEquals(testPets.getTotalSpent(), cost2, .01);
        Assert.assertEquals(testPets.getCategoryName(), "Pets");
        Assert.assertEquals(testPets.getTransactionLength(), 1, .01);
    }
    @Test
    public void categoryTest6() {
        Groceries testGrocery = new Groceries();
        Random transactionsRand = new Random();
        int transactionsToAdd = transactionsRand.nextInt(1000);
        for(int i=0; i < transactionsToAdd; i++) {
            testGrocery.addTransaction(transaction1);
        }
        Assert.assertEquals(testGrocery.getCategoryName(), "Groceries");
        Assert.assertEquals(testGrocery.getTotalSpent(), cost1*transactionsToAdd, .1);
        Assert.assertEquals(testGrocery.getTransactionLength(), transactionsToAdd, .1);
    }
    @Test
    public void categoryTest7() {
        Groceries testGrocery = new Groceries();
        Assert.assertEquals(testGrocery.getBudget(), 0, 0);
        testGrocery.setBudget(cost1);
        Assert.assertEquals(testGrocery.getBudget(), cost1, .1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void categoryTest8() {
        HomeImprovement testHomeImprovement = new HomeImprovement();
        testHomeImprovement.setBudget(-1);

    }
}
