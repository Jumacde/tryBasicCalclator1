package com.example.trybasiccalclator1;

import com.example.trybasiccalclator1.impl.Display_impl;
import com.example.trybasiccalclator1.impl.Operator_impl;

public interface CalcLogic {
    void clear();

    boolean getIsNum();
    double getCNum();
    double getSNum();

    void setDependencies(Display_impl displayImpl, Operator_impl operatorImpl)

    /**
     * process the inputted integer and decimal number.
     * */
    void appendDigit(int digit);
    /**
     * to call other classes private methods from this class
     * */
    void callMethods();
}
