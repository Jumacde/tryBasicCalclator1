package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
/**
 * control calculate method by this class
 * **/
public class CalcLogic_impl implements CalcLogic {
    private double cNum; // current number
    private double sNum; // stored number
    private boolean isInputNum;

    public CalcLogic_impl() {
        clear();
    }


    @Override
    public double getCNum() {
        return cNum;
    }

    @Override
    public double getSNum() {
        return sNum;
    }

    @Override
    public boolean getIsInputNum() {
        return isInputNum;
    }

    @Override
    public void setCNum(double cNum) {
        this.cNum = cNum;
    }

    @Override
    public void setSNum(double sNum) {
        this.sNum = sNum;
    }

    @Override
    public void setIsInputNum(boolean isInputNum) {
        this.isInputNum = isInputNum;
    }

    @Override
    public void clear() {
        this.cNum = 0;
        this.sNum = 0;
        this.isInputNum = true;

    }
    /**
     * - Wrapper method
     * allow to access other classes private method(s)
     * **/
    @Override
    public void callCalcResult(String operator) {
        calcResult(operator);
    }

    /**
     * method: define calculate rule.
     * @ param: operator
     *  use the String operator from the class Operator_impl
     *  to avoid cross-reference issues
     * **/
    private void calcResult(String operator) {



    }
}