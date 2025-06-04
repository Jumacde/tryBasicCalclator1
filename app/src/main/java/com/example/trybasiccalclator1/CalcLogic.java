package com.example.trybasiccalclator1;

public interface CalcLogic {
    void clear();

    boolean getIsNum();
    double getCNum();
    double getSNum();

    /**
     * process the inputted integer and decimal number.
     * */
    void appendDigit(int digit);
    /**
     * to call other classes private methods from this class
     * */
    void callMethods();
}
