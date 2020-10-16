package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    private static int ADDITION = 1;
    private static int SUBTRACTION = 2;
    private static int MULTIPLICATION = 3;
    private static int DIVISION= 4;

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.

        if(operation == ADDITION){
            Add addValue = new Add(argumentOne,argumentTwo);
            mOut.print(addValue.toString());
        }else if (operation==SUBTRACTION){
            Subtract subtractValue = new Subtract(argumentOne,argumentTwo);
            mOut.print(subtractValue.toString());
        }else if (operation==MULTIPLICATION){
            Multiply multiplyValue =new Multiply(argumentOne,argumentTwo);
            mOut.print(multiplyValue.toString());
        }else if (operation==DIVISION)
            {Divide divideValue=new Divide(argumentOne,argumentTwo);
        mOut.print(divideValue.toString());
        }

//        switch (operation){
//            case 1:
//               Add addValue = new Add(argumentOne,argumentTwo);
//               mOut.print(addValue.toString());
//                break;
//            case 2:
//                Subtract subtractValue = new Subtract(argumentOne,argumentTwo);
//                mOut.print(subtractValue.toString());
//                break;
//            case 3:
//                Multiply multiplyValue =new Multiply(argumentOne,argumentTwo);
//                mOut.print(multiplyValue.toString());
//                break;
//            case 4:
//                Divide divideValue=new Divide(argumentOne,argumentTwo);
//                mOut.print(divideValue.toString());
//                break;
//            default:
//                mOut.print("Invalid");
//        }
    }
}
