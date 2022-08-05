/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Subtraction inherits from abstract class CalculatorOperators and defines calculate method
 * that handles subtraction of user entered input values.
 */
public class Subtraction extends CalculatorOperators{
    /**
     * method subtract takes String input values from the user, converts them to double type, subtracts values and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double result after subtraction
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before subtracting
        Double subtract = Double.parseDouble(firstInputValue) - Double.parseDouble(secondInputValue);
        return subtract;
    }

}
