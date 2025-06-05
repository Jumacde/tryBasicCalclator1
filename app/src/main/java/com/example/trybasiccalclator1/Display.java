package com.example.trybasiccalclator1;

import com.example.trybasiccalclator1.impl.CalcLogic_impl;
import com.example.trybasiccalclator1.impl.Operator_impl;

public interface Display {
    void clear();
    String getDisplay();
    void setDisplay(String display);
    void setDependencies(Operator_impl operatorImpl, CalcLogic_impl calcLogicImpl)
    /**
     * to call other classes private methods from this class
     * */
    void callUpdateDisplay();
}
