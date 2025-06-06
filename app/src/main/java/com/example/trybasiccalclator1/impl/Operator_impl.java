package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
import com.example.trybasiccalclator1.Operator;

/**
 * control all operators here
 * **/

public class Operator_impl implements Operator {
    private String currentOperator; // current operator

    public Operator_impl() {
        this.currentOperator = "";
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
        double x = calcLogic.getCurrentNumber();
        // if a operator between the current and stored number already is and no number is after that inputted.
        // ex. 1 + 1
        if (!currentOperator.isEmpty() && !calcLogic.getIsInputNum()) {
            calcLogic.callCalcResult(operator); // calculate by the current operator
            calcLogic.setStoredNumber(x); // store the calc result for the next calculate
            calcLogic.setIsInputNum(true); // allow to input the next number
            setCurrentOperator(operator); // set a new operator
        } else if (operator.equals("=")) { // ex. 1 + 1 =
            calcLogic.callCalcResult(currentOperator); // calculate
            setCurrentOperator(""); // clear the operator after "="
            calcLogic.setStoredNumber(calcLogic.getCurrentNumber()); // save the calculate result
            calcLogic.setIsInputNum(true);
        } else { // ex. you will input a operator after 1 + 1
            setCurrentOperator(operator); // ex. 1 + 1 *
            calcLogic.setStoredNumber(calcLogic.getCurrentNumber()); // save the current numbers as stored numebr. ex. 1 + 1
            calcLogic.setIsInputNum(true); // allow input a new number after stored number. ex. 1 + 1 * 2
        }
    }



}