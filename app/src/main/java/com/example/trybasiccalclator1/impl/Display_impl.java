package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Display;

/**
 * control showing everything on the display here
 * **/

public class Display_impl implements Display {
    private String display;

    public Display_impl() {
        this.display = "0";
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setDisplay(String text) {
        this.display = text;
    }

    /**
     * - Wrapper method
     * @ param: currentNumber // input number
     * @ param: storedNumber // saved inputted number
     * @ param: operator // operator(+, - , * , /)
     * allow to access other classes private method
     * **/
    @Override
    public void callUpDateDigitOnDisplay(double currentNumber, double storedNumber, String operator) {
        upDateDigitOnDisplay(currentNumber, storedNumber, operator);
    }

    /**
     * - Wrapper method
     * @ param: storedNumber // saved inputted number
     * @ param: operator // operator(+, - , * , /)
     * allow to access other classes private method
     * **/
    @Override
    public void callUpDateOperatorOnDisplay(double storedNumber, String operator) {
        upDateOperatorOnDisplay(storedNumber, operator);
    }

    /**
     * - Wrapper method
     *      * @ param: currentNumber // input number
     *      * @ param: storedNumber // saved inputted number
     *      * @ param: operator // =
     * allow to access other classes private method
     * **/
    @Override
    public void callUpDateEqualOnDisplay(double storedNumber, String storedOperator, double currentNumber) {
        upDateEqualOnDisplay(storedNumber, storedOperator, currentNumber);
    }


    /**
     * method: define showing digits on the display
     * @ param: currentNumber // input number
     * @ param: storedNumber // saved inputted number
     * @ param: operator // operator(+, - , * , /)
     *  to avoid cross-reference issues
     * **/
    private void upDateDigitOnDisplay(double currentNumber, double storedNumber, String operator) {
        if(!operator.isEmpty()) {

        }


    }

    /**
     * method: define showing Operators(+, -, *, /) on the display
     * @ param:
     *
     *  to avoid cross-reference issues
     * **/
    private void upDateOperatorOnDisplay(double storedNumber, String operator) {}

    /**
     * method: define showing the operator "=" on the display
     * @ param:
     *
     *  to avoid cross-reference issues
     * **/
    private void upDateEqualOnDisplay(double storedNumber, String oldOperator, double currentNumber) {}

}