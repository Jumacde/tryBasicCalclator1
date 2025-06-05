package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;

public class CalcLogic_impl implements CalcLogic {
    private double cNum; // current number
    private double sNum; // stored number
    private boolean isNum; // to allow input number
    private Operator_impl operatorImpl;
    private Display_impl displayImpl;
    private String display;
    private String operator;

    public CalcLogic_impl(Display_impl displayImpl, Operator_impl operatorImpl) {
        this.operatorImpl = operatorImpl;
        this.displayImpl = displayImpl;
        this.display = displayImpl.getDisplay();
        this.operator = operatorImpl.getOperator();
        clear();
    }

    @Override
    public void clear() {
        this.cNum = 0;
        this.sNum = 0;
        this.isNum = true;
    }

    @Override
    public boolean getIsNum() {
        return isNum;
    }

    @Override
    public double getCNum() {
        return cNum;
    }

    @Override
    public double getSNum() {
        return sNum;
    }

    /**
     * process the inputted integer.
     * */
    @Override
    public void appendDigit(int digit){
        this.display = displayImpl.getDisplay(); // get the last display
        this.operator = operatorImpl.getOperator(); // get the last operator
        if (isNum) { // if a digit is entered
            cNum = digit;
            // input digit is defect
            isNum = false;

            if (!operator.isEmpty()) { // set to show the calculate step.
                display = String.valueOf(sNum) + " " + operator + " " + digit;
            } else {
                display = String.valueOf(digit);
            }
        } else { // add a digit to the current number
            cNum = cNum * 10 + digit; // add a digit using by multiplication 10.
            if (display.equals("0") && digit != 0) { // if a nun zero number is after 0 entered
                display = String.valueOf(digit); // update display from 0 to the current number
            } else if (display.endsWith(" + ")
                    || display.endsWith(" - ")
                    || display.endsWith(" * ")
                    || display.endsWith(" / ")) {
                display += digit;
            } else if (!display.equals("0")) {
                display += digit;
            } else if (display.equals("0") && digit == 0) {
                // nothing to do.
            }
        }
    }

    /**
     * to call other classes private methods from this class
     * */
    @Override
    public void callMethods() {
        calcalteResult();
    }

    /**
     * calculate method for each operator
     * **/
    private void calcalteResult() {
        double calcResult = 0;
        if (operator.isEmpty()) {
            return;
        }
        if (operator.equals("+")) {
            calcResult = sNum + cNum;
        } else if (operator.equals("-")) {
            calcResult = sNum - cNum;
        } else if (operator.equals("*")) {
            calcResult = sNum * cNum;
        } else if (operator.equals("/")) {
            if (cNum == 0 && sNum == 0) {
                calcResult = 0;
                display = "0";
                clear();
                return;
            } else {
                calcResult = sNum / cNum;
            }
        }
        cNum = calcResult;
    }



}
