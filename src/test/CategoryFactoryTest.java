package test;

import expenseTracker.Category.*;
import expenseTracker.CategoryFactory;
import org.junit.Assert;
import org.junit.Test;

public class CategoryFactoryTest {
    final double transactionCost = 12.34;
    final String transactionName = "Dummy";
    protected String name;
    CategoryFactory factoryResult = new CategoryFactory();
    @Test
    public void testCategoryFactory1() {
        name = "bills";
        Bills testBills = new Bills(transactionCost, transactionName);
        Category billsObject = factoryResult.getCategory(name, transactionCost, transactionName);
        Assert.assertEquals(testBills.getCategoryName(), billsObject.getCategoryName());
        Assert.assertEquals(testBills.getTotalSpent(), billsObject.getTotalSpent(),.01);
        Assert.assertEquals(testBills.getTransactionCost(), billsObject.getTransactionCost(),.01);
    }
    @Test
    public void testCategoryFactory2() {
        name = "Bills";
        Bills testBills = new Bills(transactionCost, transactionName);
        Category billsObject = factoryResult.getCategory(name, transactionCost, transactionName);
        Assert.assertEquals(testBills.getCategoryName(), billsObject.getCategoryName());
        Assert.assertEquals(testBills.getTotalSpent(), billsObject.getTotalSpent(),.01);
        Assert.assertEquals(testBills.getTransactionCost(), billsObject.getTransactionCost(),.01);
    }
    @Test
    public void testCategoryFactory3() {
        name = " 000";
        Category billsObject = factoryResult.getCategory(name, transactionCost, transactionName);
        Assert.assertNull(billsObject);
    }
    @Test
    public void testCategoryFactory4() {
        name = "eating out";
        EatingOut testEatOut = new EatingOut(transactionCost, transactionName);
        Category eatOutObject = factoryResult.getCategory(name, transactionCost, transactionName);
        Assert.assertEquals(testEatOut.getCategoryName(), eatOutObject.getCategoryName());
        Assert.assertEquals(testEatOut.getTotalSpent(), eatOutObject.getTotalSpent(),.01);
        Assert.assertEquals(testEatOut.getTransactionCost(), eatOutObject.getTransactionCost(),.01);
    }
    @Test
    public void testCategoryFactory5() {
        name = "eatingout";
        EatingOut testEatOut = new EatingOut(transactionCost, transactionName);
        Category eatOutObject = factoryResult.getCategory(name, transactionCost, transactionName);
        Assert.assertEquals(testEatOut.getCategoryName(), eatOutObject.getCategoryName());
        Assert.assertEquals(testEatOut.getTotalSpent(), eatOutObject.getTotalSpent(),.01);
        Assert.assertEquals(testEatOut.getTransactionCost(), eatOutObject.getTransactionCost(),.01);
    }
    @Test
    public void testCategoryFactory6() {
        name = "    ";
        Category billsObject = factoryResult.getCategory(name, transactionCost, transactionName);
        Assert.assertNull(billsObject);
    }
}
