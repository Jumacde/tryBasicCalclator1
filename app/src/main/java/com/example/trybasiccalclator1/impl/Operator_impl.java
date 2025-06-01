package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Operator;

public class Operator_impl implements Operator {
    private String operator;
    private String calcStep;

    public Operator_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.operator = "";
        this.calcStep = "";
    }

    @Override
    public String getOperator() {
        return operator;
    }

    // process chosen operator
    @Override
    public void processOperator() {

    }

    private String showCalcStep() {
        return calcStep;
    }

}
