/**
 * @author Sravya Ravula
 * @version 1.0
 * @since 2022-08-05
 * This is an interface for a Calculator that allows addition, subtraction, multiplication, division,
 * getting remainder after division, raising to a power and finding any root of a value. It contains abstract calculate method.
 */
public interface Calculation {
    /**
     * abstract method calculate takes two String user inputs.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return has a double return type
     */
    public abstract Double calculate (String firstInputValue,String secondInputValue);
}
