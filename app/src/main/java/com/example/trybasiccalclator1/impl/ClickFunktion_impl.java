package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
import com.example.trybasiccalclator1.ClickFunktion;
import com.example.trybasiccalclator1.Display;
import com.example.trybasiccalclator1.Operator;

public class ClickFunktion_impl implements ClickFunktion {

    private Operator callProcessOperator;

    public ClickFunktion_impl(Operator callProcessOperator) {
        this.callProcessOperator = callProcessOperator;
    }

    /**
     * - Wrapper method
     * allow to access other classes private method
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * @ Param: digit
     * **/
    @Override
    public void callDigitClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, int digit) {
        digitClick(calcLogic, display, operatorProcessor, digit);
    }

    /**
     * - Wrapper method
     * allow to access other classes private method
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * **/
    @Override
    public void callACClick(CalcLogic calcLogic, Display display, Operator operatorProcessor) {
        aCClick(calcLogic, display, operatorProcessor);
    }

    /**
     * - Wrapper method
     * allow to access other classes private method
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * @ Param: operator
     * **/
    @Override
    public void callOperatorClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, String operator) {
        operatorClick(calcLogic, display, operatorProcessor, operator);
    }

    /**
     * - method
     *
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * @ Param: operator
     * **/
    private void digitClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, int digit){
        boolean isInputNum = calcLogic.getIsInputNum();
        double currentNumber = calcLogic.getCurrentNumber();
        double storedNumber = calcLogic.getStoredNumber();
        String currentOperator = operatorProcessor.getCurrentOperator();
        if (isInputNum) {
            calcLogic.setCurrentNumber(digit);
            calcLogic.setIsInputNum(false);
            display.callUpDateDigit_OnDisplay(
                    currentNumber, storedNumber,
                    currentOperator,digit);
        } else {
            calcLogic.setCurrentNumber(currentNumber * 10 + digit);
            display.callUpDateDigit_OnDisplay(currentNumber, storedNumber, currentOperator, digit);
        }
    }

    /**
     * - method
     *
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * **/
    private void aCClick(CalcLogic calcLogic, Display display, Operator operatorProcessor) {
        calcLogic.clear();
        operatorProcessor.setCurrentOperator("");
        display.setDisplay("0");

    }

    /**
     * - method
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * @ Param: operator
     * **/
    private void operatorClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, String operator) {
        double storedNumber = calcLogic.getStoredNumber();
        String StrSNum = display.callFormatNum_OnDisplay(storedNumber);
        String StrCNum = display.callFormatNum_OnDisplay(calcLogic.getCurrentNumber());
    }

}
