package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnSubmit;
    TextView txtFloatingName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtFloatingName = findViewById(R.id.txtFloatingName);

        btnSubmit.setOnClickListener(v -> {

            String name = edtName.getText().toString().trim();

            if (name.isEmpty()) {
                Toast.makeText(MainActivity.this,
                        "Please enter your name",
                        Toast.LENGTH_SHORT).show();
            } else {
                txtFloatingName.setText(name);
                Toast.makeText(MainActivity.this,
                        "Welcome " + name,
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}