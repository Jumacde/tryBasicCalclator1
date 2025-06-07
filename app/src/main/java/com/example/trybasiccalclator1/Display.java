package com.example.trybasiccalclator1;

public interface Display {
    String getDisplay();
    void setDisplay(String text);
    // wrap methods
    void callUpDateDigit_OnDisplay(double currentNumber, double storedNumber, String operator, int digit);
    void callUpDateOperator_OnDisplay(double storedNumber, String operator);
    void callUpDateEqual_OnDisplay(double storedNumber, String storedOperator, double currentNumber);
    String callFormatNum_OnDisplay(double num);

}
