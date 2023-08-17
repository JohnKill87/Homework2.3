package pro.sky.lightcalculatordemo.exceptions;

public class CantDivideByZeroException extends IllegalArgumentException{
    public CantDivideByZeroException (String message) {
        super(message);
    }
}
