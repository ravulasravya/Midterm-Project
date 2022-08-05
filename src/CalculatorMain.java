/**
 * @author Sravya Ravula
 * @version 1.0
 * @since 2022-08-05
 * class CalculatorMain contains the main method and processes string inputs from
 * the scanner inside a loop and makes calculations based on the entered operator until it is turned OFF.
 */
import java.util.Scanner;

public class CalculatorMain {

    /**
     * method main serves as the starting point for this project, and can be turned ON to start and OFF to stop calculating.
     * Prompts user to select from given operators and enter input values to calculate.
     * Provides HELP to guide user. Handles invalid inputs entered. It returns nothing.
     * @param args --String array which takes keyboard parameters after the program name
     *               separated by spaces
     */
    public static void main(String[] args) {
	System.out.println("Welcome to my Calculator!" + "\n");
        Scanner operatorScanner = new Scanner(System.in);
        Scanner choiceScanner = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);
        Calculator inputs = new Calculator();

        //Enter ON to start calculating
        System.out.println("Type ON to start calculating");
        String choice = choiceScanner.nextLine();
        System.out.println("\n");

        //loops until user enters OFF to stop
          while(choice.equalsIgnoreCase("ON")){

            //prompt to enter operator or HELP
            System.out.println("Enter +, -, *, /, %, ^, ~");
            System.out.println("OR" +"\n" + "Type HELP for more details");
            String action = inputScanner.nextLine();
            System.out.println("\n");
            if(action.equalsIgnoreCase("HELP")){
                  String helpText = inputs.toString();
                  System.out.println(helpText);
                  System.out.println("Enter +, -, *, /, %, ^, ~");
                  action = inputScanner.nextLine();
            }

            //prompt for first input
            System.out.println("Type the first number: ");
            String firstInputValue = inputScanner.nextLine();
            firstInputValue = inputs.handleEOrPiInputValues(firstInputValue);

            //prompt for second input
            System.out.println("Type the second number: ");
            String secondInputValue = inputScanner.nextLine();
            secondInputValue = inputs.handleEOrPiInputValues(secondInputValue);

            Addition add = new Addition();
            Subtraction subtract = new Subtraction();
            Multiplication multiply = new Multiplication();
            Division divide = new Division();
            ModuloDivision remainder = new ModuloDivision();
            RaiseToPower power = new RaiseToPower();
            Root root = new Root();
            try {
                switch (action) {
                    case "+":
                        System.out.println(firstInputValue + " added to " + secondInputValue + " equals " + add.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    case "-":
                        System.out.println(firstInputValue + " substracted by " + secondInputValue + " equals " + subtract.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    case "*":
                        System.out.println(firstInputValue + " multiplied by " + secondInputValue + " equals " + multiply.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    case "/":
                        System.out.println(firstInputValue + " divided by " + secondInputValue + " equals " + divide.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    case "%":
                        System.out.println("Remainder for "+ firstInputValue + " divided by " + secondInputValue + " equals " + remainder.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    case "^":
                        System.out.println(firstInputValue + " raised to power " + secondInputValue + " equals " + power.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    case "~":
                        System.out.println(firstInputValue + " root of " + secondInputValue + " equals " + root.calculate(firstInputValue, secondInputValue) + ".");
                        break;
                    default:
                        System.out.println("Please choose only from the given operators");
                }
            }
            catch (Exception e){
                System.out.println("Invalid entry. Please re-enter correct values.");
            }

            //see if the user wants to continue
            System.out.println("Continue?   (OFF/ON): ");
            choice = operatorScanner.nextLine();
            System.out.println();
        }
        //close scanners
        operatorScanner.close();
        choiceScanner.close();
        inputScanner.close();
        System.out.println("Bye!");
        }
    }
