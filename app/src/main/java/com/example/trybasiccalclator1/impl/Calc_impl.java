package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Calc;

public class Calc_impl implements Calc {
    private double currentDigit;
    private double storedDigit;
    private String operator;
    private boolean isDigit;

    public Calc_impl() {
        clear();
    }

    // initialize values
    @Override
    public void clear() {
        this.currentDigit = 0;
        this.storedDigit = 0;
        this.operator = " ";
        this.isDigit = true;
    }

    // calc method
    private void calcResult() {
        if (operator.isEmpty()) {
            return;
        }
        double result = 0;
        if (operator.equals("+")) {
            result = storedDigit + currentDigit;
        } else if (operator.equals("-")) {
            result = storedDigit - currentDigit;
        } else if (operator.equals("*")) {
            result = storedDigit * currentDigit;
        } else if (operator.equals("/")) {
            if (currentDigit == 0 || storedDigit == 0) {
                result = 0;
            } else {
                result = storedDigit / currentDigit;
            }
        }
    }
}
