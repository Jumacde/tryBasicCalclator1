package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Display;

public class Display_impl implements Display {
    private String display;

    private CalcLogic_impl calcLogicImpl;
    private Operator_impl operatorImpl;

    private double sNum;
    private double cNum;
    private boolean isNum;
    private String operator;

    public Display_impl(Operator_impl operatorImpl, CalcLogic_impl calcLogicImpl) {
        this.calcLogicImpl = calcLogicImpl;
        this.operatorImpl = operatorImpl;
        clear();
        this.sNum = calcLogicImpl.getSNum();
        this.cNum = calcLogicImpl.getCNum();
        this.isNum = calcLogicImpl.getIsNum();
        this.operator = operatorImpl.getOperator();
    }

    @Override
    public void clear() {
        this.display = "0";
    }


    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public void setDependencies(Operator_impl operatorImpl, CalcLogic_impl calcLogicImpl) {
        this.operatorImpl = operatorImpl;
        this.calcLogicImpl = calcLogicImpl;
        this.sNum = calcLogicImpl.getSNum();
        this.cNum = calcLogicImpl.getCNum();
        this.isNum = calcLogicImpl.getIsNum();
        this.operator = operatorImpl.getOperator();
    }

    /**
     * to call other classes private methods from this class
     * */
    @Override
    public void callUpdateDisplay() {
        updateDisplay();
    }

    private void updateDisplay( ) {
        this.sNum = calcLogicImpl.getSNum(); // get the last sNum
        this.cNum = calcLogicImpl.getCNum(); // get the last cNum
        this.operator = operatorImpl.getOperator(); // get the last operator

        String initSNum = String.valueOf(sNum);
        String initCNum = String.valueOf(cNum);

        if (operator.equals("=")) {
            String result = String.valueOf(cNum);
            display = sNum + " "+ operator + " " + cNum + " = " + result;
        } else {
            display = String.valueOf(cNum);
        }
    }
}
