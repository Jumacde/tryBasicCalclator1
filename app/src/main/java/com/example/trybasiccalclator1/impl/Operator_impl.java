package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Operator;

public class Operator_impl implements Operator {
    private String cOperator; // current operator
    private String sOperator; // stored operator

    public Operator_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.cOperator = "";
        this.sOperator = "";
    }
}
