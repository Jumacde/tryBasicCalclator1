package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Operator;

public class Operator_impl implements Operator {
    private String operator;

    private CalcLogic_impl calcLogicImpl;
    private Display_impl displayImpl;

    private boolean isNum = calcLogicImpl.getIsNum();
    private double sNum = calcLogicImpl.getSNum();
    private double cNum = calcLogicImpl.getCNum();
    private String display = displayImpl.getDisplay();

    public Operator_impl() {

        clear();
    }

    @Override
    public String getOperator() {
        return operator;
    }

    @Override
    public void clear() {
        this.operator = "";
    }

    @Override
    public void appendOperator(String op) {
        if (!operator.isEmpty() && !isNum) {
            // perform the calculation with the previous operator and  the result store in the current number
            calcLogicImpl.callMethods();
            // the calculate result store as the starting number for the next calculation
            sNum = cNum;
            // the next input number is a new number
            isNum = true;
            // new entered operator is saved
            operator = op;
            updateDisplay();
        } else if (op.equals("=")) {
            String initSNum = String.valueOf(sNum);
            String initCNum = String.valueOf(cNum);
            String oldOperator = operator; // to save the current operator
            updateDisplay();
            calcLogicImpl.callMethods();
            display = initSNum + " " + oldOperator + " " + initCNum + " " + "=";

            operator = "";
            sNum = cNum;
            isNum = true;
            updateDisplay();
        } else {
            operator = op;
            sNum = cNum;
            isNum = true;
            updateDisplay();
        }

    }

    /**
     * to call other classes private methods from this class
     * */
    @Override
    public void callMethods(){
        updateDisplay();
    }

    /**
     * setting for the showing numbers on the display
     * */
    private void updateDisplay() {}
}
