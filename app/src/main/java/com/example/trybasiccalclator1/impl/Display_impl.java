package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Display;

public class Display_impl implements Display {
    private String display;

    private CalcLogic_impl calcLogicImpl;
    private Operator_impl operatorImpl;


    public Display_impl(Operator_impl operatorImpl) {
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
    public void callMethods() {

    }
}
