import java.util.ArrayList;

/**
 * Model class
 *
 * Version 1.1
 *
 * Updated 15.07.2019
 *
 * Created by Templar on 12.07.2019.
 */
public class Model {
    private int hiddenNumber;
    private int inputNumber;
    private ArrayList<Integer> previousInput = new ArrayList<>();
    private int min;
    private int max;

    public void setHiddenNumber(int hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }

    public int getHiddenNumber() {return hiddenNumber;}

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {return inputNumber;}

    public void setPreviousInput (int s) {this.previousInput.add(s);}

    public ArrayList<Integer> getPreviousInput() {return previousInput;}

    public void setMin(int min) {this.min = min;}

    public int getMin() {return min;}

    public void setMax (int max) {this.max = max;}

    public int getMax() {return max;}
}
