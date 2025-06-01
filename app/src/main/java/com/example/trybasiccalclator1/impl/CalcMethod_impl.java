package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcMethod;

public class CalcMethod_impl implements CalcMethod {
    private double currentNumber;
    private double storedNumber;
    private String operator;

    public CalcMethod_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.storedNumber = 0;
        this.currentNumber = 0;
        this.operator = "";
    }

    private void calcResult(){}

    private void applyOperator(){}
}
