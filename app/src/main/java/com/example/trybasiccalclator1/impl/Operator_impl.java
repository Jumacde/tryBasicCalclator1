package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Operator;

/**
 * control all operators here
 * **/

public class Operator_impl implements Operator {
    private String currentOperator; // current operator

    public Operator_impl() {
    }

    @Override
    public String getCurrentOperator() {
        return currentOperator;
    }

    @Override
    public void setCurrentOperator(String currentOperator) {
        this.currentOperator = currentOperator;
    }


    /**
     * - Wrapper method
     * allow to access other classes private method(s)
     * **/
    @Override
    public void callProcessOperator() {

    }



}