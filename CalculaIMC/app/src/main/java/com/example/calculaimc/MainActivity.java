package com.example.calculaimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaimc (View view) {
        double peso = Double.parseDouble(inputPeso.getText().toString());
    }
    EditText inputPeso = findViewById(R.id.inputPeso);
    EditText inputAltura = findViewById(R.id.inputAltura);
    TextView message = findViewById(R.id.Resultado);


        float peso = Float.parseFloat(inputPeso.getText().toString());}
