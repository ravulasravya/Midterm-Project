/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Root inherits from abstract class CalculatorOperators and defines calculate method
 * that handles any root of user entered input values.
 */
public class Root extends CalculatorOperators{
    /**
     * method calculate takes String input values from the user, converts them to double type, calculates any root.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double value after calculating the root
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before calculation. Uses Math class method.
        long rootValue = Math.round(Math.pow(Double.parseDouble(secondInputValue),1/Double.parseDouble(firstInputValue)));
        Double root = (double)rootValue;
        return root;
    }
}
