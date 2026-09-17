package com.example.kietasapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean toggled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.myTextView);
        Button button = findViewById(R.id.myButton);

        button.setOnClickListener(v -> {
            if (toggled) {
                textView.setText("Labas!");
            } else {
                textView.setText("Paspaudei, tu KIETAS!");
            }
            toggled = !toggled;
        });
    }
}