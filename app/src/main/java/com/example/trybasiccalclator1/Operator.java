package com.example.trybasiccalclator1;

public interface Operator {
    String getCurrentOperator();
    void setCurrentOperator(String currentOperator);
    void callProcessOperator(); // wrap method
}
