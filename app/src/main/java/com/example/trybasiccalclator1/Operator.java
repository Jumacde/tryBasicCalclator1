package com.example.trybasiccalclator1;

import com.example.trybasiccalclator1.impl.CalcLogic_impl;
import com.example.trybasiccalclator1.impl.Display_impl;

public interface Operator {
    String getOperator();
    void setOperator(String operator);
}
