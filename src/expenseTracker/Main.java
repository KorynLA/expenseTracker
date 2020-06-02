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
        //used to determine the file in the args array to be opened
        int statementsToEnter = args.length-1;

        //Go through all files listed in command line to be entered into program
        while(statementsToEnter > -1) {
            String fileName = args[statementsToEnter];
            File statement = new File(fileName);
            //Attempt to open file and go through every line
            try {
                Scanner readStatement = new Scanner(statement);
                while (readStatement.hasNextLine()) {
                    String parseStatement = readStatement.nextLine();
                    List<String> items = Arrays.asList(parseStatement.split(","));
                    System.out.println(items);
                }
                readStatement.close();
            }
            //If file is not found catch the error and print the error stack
            catch (FileNotFoundException err) {
                System.out.println("File not found!");
                err.printStackTrace();
            }
            statementsToEnter--;
        }
    }
}
