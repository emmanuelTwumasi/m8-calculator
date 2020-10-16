package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int statement1;
    private int statement2;

    //constructor takes two prams
    public Multiply(int statement1, int statement2) {
        this.statement1 = statement1;
        this.statement2 = statement2;
    }

    //overrides the toString method
    @Override
    public String toString() {
        return String.valueOf(statement1*statement2);
    }
}
