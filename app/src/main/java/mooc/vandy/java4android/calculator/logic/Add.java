package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    private int statement1;
    private int statement2;
    // TODO - add your solution here.

    //constructor with two prams
    public Add(int statement1, int statement2){
        this.statement1 = statement1;
        this.statement2 = statement2;
    }

    //override toString method
    @Override
    public String toString() {
        return String.valueOf(statement1 + statement2);
    }
}
