/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Addition inherits from abstract class CalculatorOperators and defines calculate method
 * that handles addition of user entered input values.
 */
public class Addition extends CalculatorOperators{
    /**
     * method calculate takes String input values from the user, converts them to double type, adds values and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return returns Double addition result
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before addition
        Double add = Double.parseDouble(firstInputValue) + Double.parseDouble(secondInputValue);
        return add;
    }
}
