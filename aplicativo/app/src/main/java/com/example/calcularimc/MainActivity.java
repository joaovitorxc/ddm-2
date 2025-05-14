package com.example.calcularimc;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calcularimc.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Object view;
    private BreakIterator inputAltura;
    private BreakIterator inputPeso;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override



        public void calcularIMC(View view) {
            double peso = Double.parseDouble(inputPeso.getText().toString());
            double altura = Double.parseDouble(inputAltura.getText().toString());
            double imc = peso / (altura * altura);
            if (peso < 18.5) {
                classificacao = "Baixo Peso"
            else if (peso >)

            }
        }
    }
}