package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
import com.example.trybasiccalclator1.ClickFunktion;
import com.example.trybasiccalclator1.Display;
import com.example.trybasiccalclator1.Operator;

public class ClickFunktion_impl implements ClickFunktion {

    private Operator operator;

    public ClickFunktion_impl(Operator operator) {
        this.operator = operator;
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
    public void callDigitClick(CalcLogic calcLogic, Display display, Operator operator, int digit) {
        digitClick(calcLogic, display, operator, digit);
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
    public void callACClick(CalcLogic calcLogic, Display display, Operator operator) {
        aCClick(calcLogic, display, operator);
    }

    /**
     * - Wrapper method
     * allow to access other classes private method
     * @ Param: calcLogic, display, operator
     * call interfaces
     * @ Param: operatorStr
     * **/
    @Override
    public void callOperatorClick(CalcLogic calcLogic, Display display, Operator operator, String operatorStr) {
        operatorClick(calcLogic, display, operator, operatorStr);
    }

    /**
     * - method
     *
     * @ Param: calcLogic, display, operator
     * call interfaces
     * @ Param: digit
     * **/
    private void digitClick(CalcLogic calcLogic, Display display, Operator operator, int digit){
        boolean isInputNum = calcLogic.getIsInputNum();
        double currentNumber = calcLogic.getCurrentNumber();
        double storedNumber = calcLogic.getStoredNumber();
        String currentOperator = operator.getCurrentOperator();
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
     * @ Param: calcLogic, display, operator
     * call interfaces
     * **/
    private void aCClick(CalcLogic calcLogic, Display display, Operator operator) {
        calcLogic.clear();
        operator.setCurrentOperator("");
        display.setDisplay("0");
    }

    /**
     * - method
     * @ Param: calcLogic, display, operator
     * call interfaces
     * @ Param: operatorStr
     * **/
    private void operatorClick(CalcLogic calcLogic, Display display, Operator operator, String operatorStr) {
        double storedNumber = calcLogic.getStoredNumber();
        double currentNumber = calcLogic.getCurrentNumber();
        String strSNum = display.callFormatNum_OnDisplay(storedNumber);
        String strCNum;
        String op = operator.getCurrentOperator();

        operator.callProcessOperator(calcLogic, operatorStr);

        if (operatorStr.equals("=")) {
            strCNum = display.callFormatNum_OnDisplay(calcLogic.getCurrentNumber());
        } else {
            strCNum = display.callFormatNum_OnDisplay(calcLogic.getCurrentNumber());
        }
    }
}
