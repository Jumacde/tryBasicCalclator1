package com.example.trybasiccalclator1;

public interface ClickFunktion {

    void callDigitClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, int digit);
    void callACClick(CalcLogic calcLogic, Display display, Operator operatorProcessor);
    void callOperatorClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, String operator);
}
