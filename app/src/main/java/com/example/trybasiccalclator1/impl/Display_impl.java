package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Display;

public class Display_impl implements Display {
    private String display;

    private CalcLogic_impl calcLogicImpl;
    private Operator_impl operatorImpl;

    private double sNum = calcLogicImpl.getSNum();
    private double cNum = calcLogicImpl.getCNum();
    private boolean isNum = calcLogicImpl.getIsNum();

    private String operator = operatorImpl.getOperator();

    public Display_impl(Operator_impl operatorImp, CalcLogic_impl calcLogicImpl) {
        this.calcLogicImpl = calcLogicImpl;
        this.operatorImpl = operatorImpl;
        clear();
    }

    @Override
    public void clear() {
        this.display = "0";
    }


    @Override
    public String getDisplay() {
        return display;
    }

    /**
     * to call other classes private methods from this class
     * */
    @Override
    public void callUpdateDisplay() {
        updateDisplay();
    }

    private void updateDisplay( ) {
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
