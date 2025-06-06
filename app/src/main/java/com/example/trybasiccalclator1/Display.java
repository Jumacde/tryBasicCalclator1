package com.example.trybasiccalclator1;

public interface Display {
    String getDisplay();
    void setDisplay(String text);
    // wrap methods
    void callUpDateDigitOnDisplay(double currentNumber, double storedNumber, String operator);
    void callUpDateOperatorOnDisplay(double storedNumber, String operator);
    void callUpDateEqualOnDisplay(double storedNumber, String storedOperator, double currentNumber);


}
