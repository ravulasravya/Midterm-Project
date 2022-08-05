/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class RaiseToPower inherits from abstract class CalculatorOperators and defines calculate method
 * that raises user input values to any power entered.
 */
public class RaiseToPower extends CalculatorOperators{
    /**
     * method calculate takes String input values from the user, converts them to double type, raises to any power and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double value after raising to a power
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before calculation. Uses Math class method.
        Double power = Math.pow(Double.parseDouble(firstInputValue),Double.parseDouble(secondInputValue));
        return power;
    }
}
