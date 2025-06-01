package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcMethod;

public class CalcMethod_impl implements CalcMethod {
    private double currentNumber;
    private double storedNumber;
    private double result;
    private Operator_impl operatorImpl;
    private boolean isNum;
    private String oprator;

    public CalcMethod_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.storedNumber = 0;
        this.currentNumber = 0;
        this.result = 0;
        this.isNum = true;
    }

    // process chosen number
    @Override
    public void processDigit(int digit) {

    }

    // calc method
    private void calcResult(){
        if (oprator.isEmpty()) {
            return;
        } else if (oprator.equals("+")) {
            result = storedNumber + currentNumber;
        } else if (oprator.equals("-")) {
            result = storedNumber - currentNumber;
        } else if (oprator.equals("*")) {
            result = storedNumber * currentNumber;
        } else if (oprator.equals("/")) {
            result = storedNumber / currentNumber;
            if((currentNumber == 0) || (storedNumber == 0)) {
                result = 0;
            }
        }
        currentNumber = result;
    }



}
