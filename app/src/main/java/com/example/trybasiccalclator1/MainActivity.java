package com.example.trybasiccalclator1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trybasiccalclator1.impl.CalcLogic_impl;
import com.example.trybasiccalclator1.impl.ClickFunktion_impl;
import com.example.trybasiccalclator1.impl.Display_impl;
import com.example.trybasiccalclator1.impl.Operator_impl;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button pl, mi, mu, di, eq;
    private String op;

    private CalcLogic calcLogic;
    private Operator operator;
    private Display display;
    private ClickFunktion clickFunktion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        calcLogic = new CalcLogic_impl();
        operator = new Operator_impl();
        display = new Display_impl();
        clickFunktion = new ClickFunktion_impl(operator);

        textView = findViewById(R.id.text);
        pl = findViewById(R.id.plass);
        mi = findViewById(R.id.min);
        mu = findViewById(R.id.mul);
        di = findViewById(R.id.div);
        eq = findViewById(R.id.equal);

        updateDisplay();

        pl.setOnClickListener(v -> clickFunktion.callOperatorClick(calcLogic, display, operator, "+"));
        mi.setOnClickListener(v -> clickFunktion.callOperatorClick(calcLogic, display, operator, "-"));
        mu.setOnClickListener(v -> clickFunktion.callOperatorClick(calcLogic, display, operator, "*"));
        di.setOnClickListener(v -> clickFunktion.callOperatorClick(calcLogic, display, operator, "/"));
        eq.setOnClickListener(v -> clickFunktion.callOperatorClick(calcLogic, display, operator, "="));

    }


    private void press00(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 0);
        clickFunktion.callDigitClick(calcLogic, display, operator, 0);
        updateDisplay();
    }

    private void press0(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 0);
        updateDisplay();
    }

    private void press1(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 1);
        updateDisplay();
    }

    private void press2(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 2);
        updateDisplay();
    }

    private void press3(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 3);
        updateDisplay();
    }

    private void press4(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 4);
        updateDisplay();
    }

    private void press5(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 5);
        updateDisplay();
    }

    private void press6(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 6);
        updateDisplay();
    }

    private void press7(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 7);
        updateDisplay();
    }

    private void press8(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 8);
        updateDisplay();
    }

    private void press9(View view) {
        clickFunktion.callDigitClick(calcLogic, display, operator, 9);
        updateDisplay();
    }

    private void pressAc(View view) {
        clickFunktion.callACClick(calcLogic, display, operator);
        updateDisplay();
    }

    private void updateDisplay() {
        textView.setText(display.getDisplay());
    }

}