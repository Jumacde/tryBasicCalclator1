package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Display;

/**
 * control showing everything on the display here
 * **/

public class Display_impl implements Display {
    private String display;
    private String sNumStr;

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
     * - Wrapper method
     *      * @ param: num
     * allow to access other classes private method
     * **/
    @Override
    public void callFormatNum_OnDisplay(double num) {
        formatNum_OnDisplay(num);
    }


    /**
     * method: define showing digits on the display
     * @ param: currentNumber // input number
     * @ param: storedNumber // saved inputted number
     * @ param: operator // operator(+, - , * , /)
     *  to avoid cross-reference issues
     * **/
    private void upDateDigit_OnDisplay(double currentNumber, double storedNumber, String operator, int digit) {
        if (storedNumber == (long) storedNumber) {
            sNumStr = String.valueOf((long) storedNumber);
        } else {
            sNumStr = String.valueOf(storedNumber);
        }

        if(!operator.isEmpty()) {
            if (display.equals(sNumStr + " " + operator + " ")) {
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
     *  to avoid cross-reference issues
     * **/
    private void upDateOperator_OnDisplay(double storedNumber, String operator) {
        if (storedNumber == (long) storedNumber) {
            sNumStr = String.valueOf((long) storedNumber);
        } else {
            sNumStr = String.valueOf(storedNumber);
        }
        display = sNumStr + " " + operator + " ";
    }

    /**
     * method: define showing the operator "=" on the display
     * @ param:
     *  to avoid cross-reference issues
     * **/
    private void upDateEqual_OnDisplay(double storedNumber, String storedOperator, double currentNumber) {
        if (storedNumber == (long) storedNumber) {
            sNumStr = String.valueOf((long) storedNumber);
        } else {
            sNumStr = String.valueOf(storedNumber);
        }


        String cNumStr;
        if (currentNumber == (long) currentNumber) {
            cNumStr = String.valueOf((long) currentNumber);
        } else {
            cNumStr = String.valueOf(currentNumber);
        }
        String resultStr = formatNum_OnDisplay(currentNumber);
        display = sNumStr + " " + storedOperator + " " + cNumStr + " = "  + resultStr;

    }

    private String formatNum_OnDisplay(double num) {
        if (num == (long) num) {
            return  String.valueOf((long) num);
        } else {
            String str = String.valueOf(num);
            if (str.endsWith(".0")) {
                return str.substring(0, str.length() -2);
            }
            return str;
        }
    }
}