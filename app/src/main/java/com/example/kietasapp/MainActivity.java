package com.example.kietasapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean toggled = false;
    private boolean isRed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.myTextView);
        Button button = findViewById(R.id.myButton);
        Button colorButton = findViewById(R.id.colorButton);

        button.setOnClickListener(v -> {
            if (toggled) {
                textView.setText("Labas!");
            } else {
                textView.setText("Paspaudei, tu KIETAS!");
            }
            toggled = !toggled;
        });

        colorButton.setOnClickListener(v -> {
            if (isRed) {
                textView.setTextColor(Color.BLACK);
            } else {
                textView.setTextColor(Color.RED);
            }
            isRed = !isRed;
        });
    }
}