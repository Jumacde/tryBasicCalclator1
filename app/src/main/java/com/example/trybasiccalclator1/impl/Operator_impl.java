package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Operator;

public class Operator_impl implements Operator {
    private String operator;

    private CalcLogic_impl calcLogicImpl;
    private Display_impl displayImpl;

    private boolean isNum;
    private double sNum;
    private double cNum;
    private String display;

    public Operator_impl(CalcLogic_impl calcLogicImpl, Display_impl displayImpl) {
        this.calcLogicImpl = calcLogicImpl;
        this.displayImpl = displayImpl;
        clear();
        this.isNum = calcLogicImpl.getIsNum();
        this.sNum = calcLogicImpl.getSNum();
        this.cNum = calcLogicImpl.getCNum();
        this.display = displayImpl.getDisplay();
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
        this.isNum = calcLogicImpl.getIsNum(); // get the last isNum
        this.sNum = calcLogicImpl.getSNum(); // get the last sNum
        this.cNum = calcLogicImpl.getCNum(); // get the last cNum
        this.display = displayImpl.getDisplay(); // get the last display

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
            String oldOperator = operator; // keep to save the current operator
            updateDisplay();
            calcLogicImpl.callMethods();
            display = initSNum + " " + oldOperator + " " + initCNum + " " + "=";
            displayImpl.setDisplay(display); // Notify displayImpl of the display update

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

    @Override
    public void setDependencies(CalcLogic_impl calcLogicImpl, Display_impl displayImpl) {
        this.calcLogicImpl = calcLogicImpl;
        this.displayImpl = displayImpl;
        this.isNum = calcLogicImpl.getIsNum();
        this.sNum = calcLogicImpl.getSNum();
        this.cNum = calcLogicImpl.getCNum();
        this.display = displayImpl.getDisplay();
    }

    /**
     * to call other classes private methods from this class
     * */
    @Override
    public void callUpdateDisplay(){
        updateDisplay();
    }

    /**
     * setting for the showing numbers on the display
     * */
    private void updateDisplay() {
        updateOperator();
    }

    /**
     * set the showing of the calculate-processing using by stored number and operator
     * */
    private void updateOperator() {
        this.sNum = calcLogicImpl.getSNum(); // get the last sNum
        display = String.valueOf(sNum) + " " + operator + " ";
        displayImpl.setDisplay(display); // Notify displayImpl of the display update
    }
}
