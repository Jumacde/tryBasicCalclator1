package com.example.trybasiccalclator1;

public interface Operator {
    String getOperator();
    void clear();
    void appendOperator(String op);
    /**
     * to call other classes private methods from this class
     * */
    void callMethods();
}
