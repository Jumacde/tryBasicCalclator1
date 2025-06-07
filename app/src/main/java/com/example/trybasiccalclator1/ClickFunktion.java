package com.example.trybasiccalclator1;

public interface ClickFunktion {
    // wrap methods
    void callDigitClick(CalcLogic calcLogic, Display display, Operator operator, int digit);
    void callACClick(CalcLogic calcLogic, Display display, Operator operator);
    void callOperatorClick(CalcLogic calcLogic, Display display, Operator operator, String operatorStr);
}
