package com.example.textviewvstoastdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare UI elements
    TextView textViewMessage, textViewDynamicMessage;
    Button buttonShowMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewDynamicMessage = findViewById(R.id.textViewDynamicMessage);
        buttonShowMessage = findViewById(R.id.buttonShowMessage);

        // Set an OnClickListener for the button
        buttonShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update the TextView message
                textViewDynamicMessage.setText("Button clicked! This is a dynamic TextView message.");

                // Display a Toast message
                Toast.makeText(MainActivity.this, "This is a Toast message.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
