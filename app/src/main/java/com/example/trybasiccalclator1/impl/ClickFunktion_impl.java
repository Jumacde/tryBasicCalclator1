package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcLogic;
import com.example.trybasiccalclator1.ClickFunktion;
import com.example.trybasiccalclator1.Display;
import com.example.trybasiccalclator1.Operator;

public class ClickFunktion_impl implements ClickFunktion {

    private Operator callProcessOperator;

    public ClickFunktion_impl(Operator callProcessOperator) {
        this.callProcessOperator = callProcessOperator;
    }

    /**
     * - Wrapper methods
     * allow to access other classes private method(s)
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * @ Param: digit
     * **/
    @Override
    public void callDigitClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, int digit) {
        digitClick(calcLogic, display, operatorProcessor, digit);
    }

    /**
     * - Wrapper methods
     * allow to access other classes private method(s)
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * **/
    @Override
    public void callACClick(CalcLogic calcLogic, Display display, Operator operatorProcessor) {
        aCClick(calcLogic, display, operatorProcessor);
    }

    /**
     * - Wrapper methods
     * allow to access other classes private method(s)
     * @ Param: calcLogic, display
     * call interfaces
     * @ Param: operatorProcessor
     * call this method from the interface Operator
     * @ Param: operator
     * **/
    @Override
    public void callOperatorClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, String operator) {
        operatorClick(calcLogic, display, operatorProcessor, operator);
    }

    private void digitClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, int digit){

    }

    private void aCClick(CalcLogic calcLogic, Display display, Operator operatorProcessor) {

    }

    private void operatorClick(CalcLogic calcLogic, Display display, Operator operatorProcessor, String operator) {

    }

}
