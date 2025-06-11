package com.example.trybasiccalclator1;

public interface CalcLogic {
    double getCurrentNumber();
    double getStoredNumber();
    boolean getIsInputNum();
    String getCalcStep();

    void setCurrentNumber(double currentNumber);
    void setStoredNumber(double storedNumber);
    void setIsInputNum(boolean isInputNum);
    void setCalcStep(String calcStep);

    void clear();
    // wrap method
    void callCalcResult(String operator);
}