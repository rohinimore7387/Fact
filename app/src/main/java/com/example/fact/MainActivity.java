package com.example.fact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString().trim();
                int a = Integer.parseInt(s);

                int c, fac = 1;
                if(a>9)
                {
                    Toast.makeText(MainActivity.this, "exceeded the limit", Toast.LENGTH_SHORT).show();
                }
            else
                {
                for (c=1; c <= a; c++)

                    fac = fac * c;

                Toast.makeText(MainActivity.this, "factorial is"+fac, Toast.LENGTH_SHORT).show();
            }}
        });
    }
}