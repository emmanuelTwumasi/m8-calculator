package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int statement1;
    private int statement2;

    //constructor takes two prams
    public Divide(int statement1, int statement2) {
        this.statement1 = statement1;
        this.statement2 = statement2;
    }

    //overrides the toString method
    @Override
    public String toString() {
        //catch exception when dividing with zero
        try {
            return (statement1 / statement2 + " R " + statement1 % statement2);
        } catch (ArithmeticException e) {
            return "Argument two can not be zero";
        }
    }
}
