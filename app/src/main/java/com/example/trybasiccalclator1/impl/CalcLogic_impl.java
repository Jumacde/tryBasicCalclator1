package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
/**
 * control calculate method by this class
 * **/
public class CalcLogic_impl implements CalcLogic {
    private double currentNumber;
    private double storedNumber;
    private boolean isInputNum;
    private String calcStep;

    public CalcLogic_impl() {
        clear();
    }


    @Override
    public double getCurrentNumber() {
        return currentNumber;
    }

    @Override
    public double getStoredNumber() {
        return storedNumber;
    }

    @Override
    public boolean getIsInputNum() {
        return isInputNum;
    }

    @Override
    public String getCalcStep() {
        return calcStep;
    }

    @Override
    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public void setStoredNumber(double storedNumber) {
        this.storedNumber = storedNumber;
    }

    @Override
    public void setIsInputNum(boolean isInputNum) {
        this.isInputNum = isInputNum;
    }

    @Override
    public void setCalcStep(String calcStep) {
        this.calcStep = calcStep;
    }

    @Override
    public void clear() {
        this.currentNumber = 0;
        this.storedNumber = 0;
        this.isInputNum = true;
        this.calcStep = "";
    }
    /**
     * - Wrapper method
     * allow to access other classes private method(s)
     * **/
    @Override
    public void callCalcResult(String operator) {
        calcResult(operator);
    }

    /**
     * method: define calculate rule.
     * @ param: operator
     *  use the String operator from the class Operator_impl
     *  to avoid cross-reference issues
     * **/
    private void calcResult(String operator) {
        if(operator.isEmpty()) {
            return;
        }
        double result = 0;
        if (operator.equals("+")) {
            calcStep = String.valueOf(storedNumber) + " + " + String.valueOf(currentNumber);
            result = storedNumber + currentNumber;
        } else if (operator.equals("-")) {
            calcStep = String.valueOf(storedNumber) + " - " + String.valueOf(currentNumber);
            result = storedNumber - currentNumber;
        } else if (operator.equals("*")) {
            calcStep = String.valueOf(storedNumber) + " * " + String.valueOf(currentNumber);
            result = storedNumber * currentNumber;
        } else if (operator.equals("/")) {
            calcStep = String.valueOf(storedNumber) + " / " + String.valueOf(currentNumber);
            if (storedNumber == 0 || currentNumber == 0) {
                return;
            } else {
                result = storedNumber / currentNumber;
            }
        }
        currentNumber = result;
    }
}