package com.example.trybasiccalclator1;

public interface Operator {
    String getCurrentOperator();
    void setCurrentOperator(String currentOperator);
    void callProcessOperator(CalcLogic calcLogic, String operator); // wrap method
}
