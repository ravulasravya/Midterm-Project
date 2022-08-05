/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class ModuloDivision inherits from abstract class CalculatorOperators and defines calculate method
 * that handles moduloDivision of user entered input values.
 */
public class ModuloDivision extends CalculatorOperators{
    /**
     * method calculate takes String input values from the user, converts them to double type, gets remainder value after division and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double remainder after division
     */
    @Override
    public Double calculate(String firstInputValue,String secondInputValue){
        //parses String input values to double type before calculating the remainder value
        Double remainder = Double.parseDouble(firstInputValue) % Double.parseDouble(secondInputValue);
        return remainder;
    }

}
