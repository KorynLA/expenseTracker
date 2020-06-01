package expenseTracker;

import java.time.Month;
import java.time.Year;

public class Expense {
    private String name;
    private Month month;
    private Year year;
    private float amount;

    /***
     * Constructor for Expense class, sets all values within object
     * Return: None
     * Parameters: String name of the expense, Month the expense was made, Year the expense was made,
     * float amount of the expense
     ***/
    public Expense(String name, Month month, Year year, float amount) {
        this.name = name;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }

    /***
     * Displays name of the expense object
     * Returns: None
     * Parameters: None
     ***/
    public void displayName() {
        System.out.println(name);
    }
}
