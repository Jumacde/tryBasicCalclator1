package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.CalcMethod;

public class CalcMethod_impl implements CalcMethod {
    private double currentDigit;
    private double storedDigit;
    private double result;
    private boolean isDigit;
    private String oprator;
    private String display;

    private Operator_impl operatorImpl;
    private Display_impl displayImpl;

    public CalcMethod_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.storedDigit = 0;
        this.currentDigit = 0;
        this.result = 0;
        this.isDigit = true;
        this.oprator = operatorImpl.getOperator();
        this.display = displayImpl.getDisplay();
    }

    // process chosen number
    @Override
    public void processDigit(int chosenDigit) {
        if (isDigit) {
            currentDigit = chosenDigit;
            isDigit = false;
            if (!oprator.isEmpty()) {
                String y = (storedDigit ==(long)currentDigit)
                        ? String.valueOf((long) storedDigit)
                        : String.valueOf(storedDigit);
                display = y + " " + oprator + " " + chosenDigit;
            } else {
                display = String.valueOf(chosenDigit);
            }
        } else {
            currentDigit = chosenDigit * 10;

            if (display.equals("0") && chosenDigit != 0) {
                display = String.valueOf(chosenDigit);
            } else if (!display.equals("0") && chosenDigit != 0) {
                display += chosenDigit;
            } else if (display.equals("0") && chosenDigit == 0) {
                
            }

        }
    }

    // calc method
    private void calcResult(){
        if (oprator.isEmpty()) {
            return;
        } else if (oprator.equals("+")) {
            result = storedDigit + currentDigit;
        } else if (oprator.equals("-")) {
            result = storedDigit - currentDigit;
        } else if (oprator.equals("*")) {
            result = storedDigit * currentDigit;
        } else if (oprator.equals("/")) {
            result = storedDigit / currentDigit;
            if((currentDigit == 0) || (storedDigit == 0)) {
                result = 0;
            }
        }
        currentDigit = result;
    }



}
