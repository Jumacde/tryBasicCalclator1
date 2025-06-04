package com.example.trybasiccalclator1.impl;

import com.example.trybasiccalclator1.Display;

public class Display_impl implements Display {
    private String display;

    public Display_impl() {
        clear();
    }

    @Override
    public void clear() {
        this.display = "0";
    }


    @Override
    public String getDisplay() {
        return display;
    }
}
