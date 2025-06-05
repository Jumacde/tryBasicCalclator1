package com.example.trybasiccalclator1;

import com.example.trybasiccalclator1.impl.CalcLogic_impl;
import com.example.trybasiccalclator1.impl.Display_impl;

public interface Operator {
    String getOperator();
    void clear();
    void appendOperator(String op);
    void setDependencies(CalcLogic_impl calcLogicImpl, Display_impl displayImpl)
    /**
     * to call other classes private methods from this class
     * */
    void callUpdateDisplay();
}
