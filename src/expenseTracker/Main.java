package expenseTracker;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String fileName ="venmo_statement.csv";
        File statement = new File(fileName);
        //Attempt to open file and go through every line
        try {
            Scanner readStatement = new Scanner(statement);
            System.out.println("opening file");
            while(readStatement.hasNextLine()) {
                String parseStatement = readStatement.nextLine();
                List<String> items = Arrays.asList(parseStatement.split(","));
                System.out.println(items);
            }
            readStatement.close();
        }
        //If file is not found catch the error and print the error stack
        catch(FileNotFoundException err) {
            System.out.println("File not found!");
            err.printStackTrace();
        }
    }
}
