/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Calculator contains methods to handle PI and E (ignores case) user inputs, checks the input is a valid double number and
 * provides HELP feature to guide user.
 */
public class Calculator {

    /**
     * method handleEOrPiInputValues takes String input value from the user, if PI or E, ignores case, and assigns to Math constants.
     * else, calls confirmDouble method to validate input value.
     * @param inputValue -- String input value entered via scanner
     * @return  assigns math class constants to String input, converts to String and returns value.
     */
     public String handleEOrPiInputValues(String inputValue){
        Double handledInputValue = 0.0;
        if(inputValue.equalsIgnoreCase((MathNumbers.PI).toString())){
            handledInputValue = Math.PI;
            inputValue = handledInputValue.toString();
        }
        else if(inputValue.equalsIgnoreCase((MathNumbers.E).toString())){
            handledInputValue = Math.E;
            inputValue = handledInputValue.toString();
        }
        else {
            this.confirmDouble(inputValue);
        }
        return inputValue;
    }

    /**
     * method confirmDouble tests the String inputString to see if it is a valid
     * double number, if so it returns this double number as a String, if not, it
     * returns a null.
     * @param inputString -- a String entered via the Scanner to be tested via
     *                    Double.parseDouble() to see if it is a valid double number
     * @return String which is either a double value converted back to a String or null
     * if the passed-in String could not be converted to a String
     */
    public String confirmDouble (String inputString) {
        String doubleToStringReturnValue = "";
        try {
            double parseDoubleResult = Double.parseDouble(inputString);
            doubleToStringReturnValue = Double.toString(parseDoubleResult);
        } catch (NullPointerException e) {
            doubleToStringReturnValue = null;
        } catch (NumberFormatException e) {
            doubleToStringReturnValue = null;
        } catch (Exception e) { // Exception e -- should be the very last
            // it is the catch-all, and the most general
            doubleToStringReturnValue = null;
        }
        return doubleToStringReturnValue;
    }

    /**
     * method toString provides guidance to user on operators and features available for calculations using StringBuilder.
     * @return  returns built String value.
     */
    @Override
    public String toString() {
        //Used StringBuilder as this is not a multithreaded application. StringBuilder improves efficiency of code. Capacity of String
        //is automatically allocated as needed.
        StringBuilder displayHelp = new StringBuilder(2);
        displayHelp.append("Please enter operator/sign only from below options: " + "\n");
        displayHelp.append("Enter + to add, - to subtract, * to multiply, / to divide " + "\n");
        displayHelp.append("Enter % for modulo division, ^ to raise to any power, ~ for getting root" + "\n");
        displayHelp.append("You can also input PI or E in upper or lower case to calculate" + "\n");
        return displayHelp.toString();
    }
}
