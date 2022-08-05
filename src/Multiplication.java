/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Multiplication inherits from abstract class CalculatorOperators and defines calculate method
 * that handles multiplication of user entered input values.
 */
public class Multiplication extends CalculatorOperators{
    /**
     * method calculate takes String input values from the user, converts them to double type, multiplies values and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double result after multiplication
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before multiplication
        Double multiply = Double.parseDouble(firstInputValue) * Double.parseDouble(secondInputValue);
        return multiply;
    }

}
