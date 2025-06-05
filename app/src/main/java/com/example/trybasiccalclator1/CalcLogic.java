package com.example.trybasiccalclator1;

public interface CalcLogic {
    double getCNum();
    double getSNum();
    boolean getIsInputNum();

    void setCNum(double cNum);
    void setSNum(double sNum);
    void setIsInputNum(boolean isInputNum);

    void clear();
    void callCalcResult();
}