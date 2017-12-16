package com.example.android.resistorvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView firstColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstColor = (TextView)findViewById(R.id.firstColor);
    }

    public void changeFirstColor(View view) {
        Button x=(Button)view;
        String name = x.getText().toString();
        Toast.makeText(this, "The button is "+ name, Toast.LENGTH_SHORT).show();
    }
}
