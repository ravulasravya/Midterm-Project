/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Division inherits from abstract class CalculatorOperators and defines calculate method
 * that handles division of user entered input values.
 */
public class Division extends CalculatorOperators{
    /**
     * method calculate takes String input values from the user, converts them to double type, divides first value by second value and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double result after division
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before division
        Double divide = Double.parseDouble(firstInputValue) / Double.parseDouble(secondInputValue);
        return divide;
    }

}
