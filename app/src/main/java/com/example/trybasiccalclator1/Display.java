package com.example.trybasiccalclator1;

public interface Display {
    void clear();
    String getDisplay();
    /**
     * to call other classes private methods from this class
     * */
    void callUpdateDisplay();
}
