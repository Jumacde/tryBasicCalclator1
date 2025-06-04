package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;

public class CalcLogic_impl implements CalcLogic {
    private double cDigit; // current digit
    private double sDigit; // stored digit
    private boolean isDigit; // to allow input digit

    public CalcLogic_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.cDigit = 0;
        this.sDigit = 0;
        this.isDigit = true;
    }

    /**
     * process the inputted integer and decimal number.
     * */
    public void appendDigit(int digit){


    }
}
