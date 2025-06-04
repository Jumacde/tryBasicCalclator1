package com.example.trybasiccalclator1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.trybasiccalclator1.impl.CalcLogic_impl;
import com.example.trybasiccalclator1.impl.Display_impl;
import com.example.trybasiccalclator1.impl.Operator_impl;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button pl, mi, mu, di, eq;

    private CalcLogic calcLogic;
    private Operator operator;
    private Display display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pl = findViewById(R.id.plass);
        mi = findViewById(R.id.min);
        mu = findViewById(R.id.mul);
        di = findViewById(R.id.div);
        eq = findViewById(R.id.equal);

        operator = new Operator_impl(new CalcLogic_impl(null, null), new Display_impl(null, null));
        calcLogic = new CalcLogic_impl(new Operator_impl(null, null), new Display_impl(null, null));
        display = new Display_impl(new Operator_impl(null, null), new CalcLogic_impl(null, null));

        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         */
    }
}