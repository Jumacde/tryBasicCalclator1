package com.example.trybasiccalclator1;

public interface CalcLogic {
    double getCurrentNumber();
    double getStoredNumber();
    boolean getIsInputNum();

    void setCurrentNumber(double currentNumber);
    void setStoredNumber(double storedNumber);
    void setIsInputNum(boolean isInputNum);

    void clear();
    // wrap method
    void callCalcResult(String operator);
}