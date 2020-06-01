package expenseTracker;

import java.time.Month;
import java.time.Year;

public class Expense {
    private String name;
    private Month month;
    private Year year;
    private int amount;

    public Expense(String name, Month month, Year year, int amount) {
        this.name = name;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }
    public void displayName() {
        System.out.println(name);
    }
}
