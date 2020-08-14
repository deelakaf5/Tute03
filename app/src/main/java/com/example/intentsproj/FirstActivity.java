package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String Mssg1 = "com.example.intentsproj.MESSAGE1";
    public static final String Mssg2 = "com.example.intentsproj.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendInfo(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

        EditText text1 = findViewById(R.id.Txt1);
        EditText text2 = findViewById(R.id.Txt2);

        String message1 = text1.getText().toString();
        String message2 = text2.getText().toString();

        intent.putExtra(Mssg1, message1);
        intent.putExtra(Mssg2, message2);

        startActivity(intent);

        Context context = getApplicationContext(); //The context to use. Usually your application or activity object

        CharSequence message = "You just clicked the OK button";

        //Display String
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}