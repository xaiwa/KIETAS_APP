package com.example.kietasapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean toggled = false;
    private boolean isRed = false;
    private boolean isDark = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = findViewById(R.id.mainLayout);
        TextView textView = findViewById(R.id.myTextView);
        Button button = findViewById(R.id.myButton);
        Button colorButton = findViewById(R.id.colorButton);
        Button darkModeButton = findViewById(R.id.darkModeButton);

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

        darkModeButton.setOnClickListener(v -> {
            if (isDark) {
                mainLayout.setBackgroundColor(Color.WHITE);
            } else {
                mainLayout.setBackgroundColor(Color.BLACK);
            }
            isDark = !isDark;
        });
    }
}