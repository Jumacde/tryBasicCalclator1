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
    public void callUpDateDigit_OnDisplay(double currentNumber, double storedNumber, String operator, int digit) {
        upDateDigit_OnDisplay(currentNumber, storedNumber, operator, digit);
    }

    /**
     * - Wrapper method
     * @ param: storedNumber // saved inputted number
     * @ param: operator // operator(+, - , * , /)
     * allow to access other classes private method
     * **/
    @Override
    public void callUpDateOperator_OnDisplay(double storedNumber, String operator) {
        upDateOperator_OnDisplay(storedNumber, operator);
    }

    /**
     * - Wrapper method
     *      * @ param: currentNumber // input number
     *      * @ param: storedNumber // saved inputted number
     *      * @ param: operator // =
     * allow to access other classes private method
     * **/
    @Override
    public void callUpDateEqual_OnDisplay(double storedNumber, String storedOperator, double currentNumber) {
        upDateEqual_OnDisplay(storedNumber, storedOperator, currentNumber);
    }


    /**
     * method: define showing digits on the display
     * @ param: currentNumber // input number
     * @ param: storedNumber // saved inputted number
     * @ param: operator // operator(+, - , * , /)
     *  to avoid cross-reference issues
     * **/
    private void upDateDigit_OnDisplay(double currentNumber, double storedNumber, String operator, int digit) {
        String stNum;
        if (storedNumber == (long) storedNumber) {
            stNum = String.valueOf((long) storedNumber);
        } else {
            stNum = String.valueOf(storedNumber);
        }

        if(!operator.isEmpty()) {
            if (display.equals(stNum + " " + operator + " ")) {
                display += String.valueOf(digit);
            } else if (display.endsWith("+")
                    || display.endsWith("-")
                    || display.endsWith("*")
                    || display.endsWith("/")) {
                display += String.valueOf(digit);
            } else {
                display += String.valueOf(digit);
            }
        } else {
            if (display.equals("0") && digit == 0) {
                display = "0";
            } else if (display.equals("0")) {
                display = String.valueOf(digit);
            } else {
                display += String.valueOf(digit);
            }
        }
    }

    /**
     * method: define showing Operators(+, -, *, /) on the display
     * @ param:
     *
     *  to avoid cross-reference issues
     * **/
    private void upDateOperator_OnDisplay(double storedNumber, String operator) {}

    /**
     * method: define showing the operator "=" on the display
     * @ param:
     *
     *  to avoid cross-reference issues
     * **/
    private void upDateEqual_OnDisplay(double storedNumber, String oldOperator, double currentNumber) {}

}