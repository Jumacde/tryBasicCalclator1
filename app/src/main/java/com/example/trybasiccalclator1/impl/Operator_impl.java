package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
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
    public void callProcessOperator(CalcLogic calcLogic, String operator) {
        processOperator(calcLogic, operator);
    }

    /**
     * method: define calculate rule.
     * @ param: operator
     * - from the method calcResult from CalcLogic_impl
     * @ param: CalcLogic
     * - call the class CalcLogic_impl via their interface class
     * to avoid cross-reference issues
     * **/
    private void processOperator(CalcLogic calcLogic, String operator){

    }



}