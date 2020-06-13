package expenseTracker;

import expenseTracker.Category.*;

public class CategoryFactory {
    public Category getCategory(String identity, double transactionCost, String transactionName) {
        identity = (identity.toLowerCase()).replaceAll("\\s+","");
        if(identity.equals("bills") || identity.equals("bill")) {
            return new Bills(transactionCost, transactionName);
        }
        else if(identity.equals("eatingout")) {
            return new EatingOut(transactionCost, transactionName);
        }
        else if(identity.equals("donations") || identity.equals("donation")) {
            return new Donations(transactionCost, transactionName);
        }
        else if(identity.equals("entertainment")) {
            return new Entertainment(transactionCost, transactionName);
        }
        else if(identity.equals("pet") || identity.equals("pets")) {
            return new Pets(transactionCost, transactionName);
        }
        else if(identity.equals("material")) {
            return new Material(transactionCost, transactionName);
        }
        else if(identity.equals("expense")) {
            return new Expenses1X(transactionCost, transactionName);
        }
        else if(identity.equals("groceries") || identity.equals("grocery")) {
            return new Groceries(transactionCost, transactionName);
        }
        else if(identity.equals("home") || identity.equals("home improvement")) {
            return new HomeImprovement(transactionCost, transactionName);
        }
        else {
            return null;
        }
    }
}
