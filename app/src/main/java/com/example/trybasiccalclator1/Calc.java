package com.example.trybasiccalclator1;

public interface Calc {
    void clear();
    void processDigit(double digit);
    void processOperator(String currentOp);
}
