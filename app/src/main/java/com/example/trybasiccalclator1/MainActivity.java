package com.example.trybasiccalclator1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trybasiccalclator1.impl.CalcLogic_impl;
import com.example.trybasiccalclator1.impl.Display_impl;
import com.example.trybasiccalclator1.impl.Operator_impl;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button pl, mi, mu, di, eq;
    String op;

    private CalcLogic calcLogic;
    private Operator operator;
    private Display display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        operator = new Operator_impl(
                new CalcLogic_impl(null, null),
                new Display_impl(null, null));
        calcLogic = new CalcLogic_impl(
                new Display_impl(null, null),
                new Operator_impl(null, null));
        display = new Display_impl(
                new Operator_impl(null, null),
                new CalcLogic_impl(null, null)
                );

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pl = findViewById(R.id.plass);
        mi = findViewById(R.id.min);
        mu = findViewById(R.id.mul);
        di = findViewById(R.id.div);
        eq = findViewById(R.id.equal);


        display.callUpdateDisplay();// updateDisplay

        pl.setOnClickListener(v -> clickOperator((Button)v, "+"));
        mi.setOnClickListener(v -> clickOperator((Button)v, "-"));
        mu.setOnClickListener(v -> clickOperator((Button)v, "*"));
        di.setOnClickListener(v -> clickOperator((Button)v, "/"));
        eq.setOnClickListener(v -> clickOperator((Button)v, "="));


        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         */
    }
    private void press00(View view) {
        calcLogic.appendDigit(0);
        calcLogic.appendDigit(0);
        display.callUpdateDisplay();
    }

    private void press0(View view) {
        calcLogic.appendDigit(0);
        display.callUpdateDisplay();
    }

    private void press1(View view) {
        calcLogic.appendDigit(1);
        display.callUpdateDisplay();
    }

    private void press2(View view) {
        calcLogic.appendDigit(2);
        display.callUpdateDisplay();
    }

    private void press3(View view) {
        calcLogic.appendDigit(3);
        display.callUpdateDisplay();
    }

    private void press4(View view) {
        calcLogic.appendDigit(4);
        display.callUpdateDisplay();
    }

    private void press5(View view) {
        calcLogic.appendDigit(5);
        display.callUpdateDisplay();
    }

    private void press6(View view) {
        calcLogic.appendDigit(6);
        display.callUpdateDisplay();
    }

    private void press7(View view) {
        calcLogic.appendDigit(7);
        display.callUpdateDisplay();
    }

    private void press8(View view) {
        calcLogic.appendDigit(8);
        display.callUpdateDisplay();
    }

    private void press9(View view) {
        calcLogic.appendDigit(9);
        display.callUpdateDisplay();
    }

    private void pressAc(View view) {
        calcLogic.clear();
        display.callUpdateDisplay();
    }

    private void clickOperator(Button button, String oprator) {
        operator.appendOperator(op);
        operator.callUpdateDisplay();
    }


    private void updateDisplay() {
        textView.setText(display.getDisplay());
    }
}