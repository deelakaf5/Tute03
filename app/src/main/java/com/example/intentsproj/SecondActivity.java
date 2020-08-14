package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    String msg1;
    String msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        msg1 = intent.getStringExtra(FirstActivity.Mssg1);
        msg2 = intent.getStringExtra(FirstActivity.Mssg2);

        EditText text1 = findViewById(R.id.Txt1);
        EditText text2 = findViewById(R.id.Txt2);

        text1.setText(msg1);
        text2.setText(msg2);
    }

    public void calcAmount(View view) {
        TextView textView = findViewById(R.id.TV1);

        double val1 = Double.parseDouble(msg1);
        double val2 = Double.parseDouble(msg2);

        if (view == findViewById(R.id.add)) {
            textView.setText(val1 + " + " + val2 + " = " + (val1 + val2));
        } else if (view == findViewById(R.id.sub)) {
            textView.setText(val1 + " - " + val2 + " = " + (val1 - val2));
        } else if (view == findViewById(R.id.mul)) {
            textView.setText(val1 + " * " + val2 + " = " + (val1 * val2));
        } else if (view == findViewById(R.id.div)) {
            textView.setText(val1 + " / " + val2 + " = " + (val1 / val2));
        }
    }
}