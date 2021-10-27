package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado;
    private EditText numero1;
    private EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = findViewById(R.id.Resultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
    }

    public void Sumar(View view){
        int resultadoNumero = Integer.parseInt(numero1.getText().toString()) + Integer.parseInt(numero2.getText().toString());
        Resultado.setText(resultadoNumero + "");
    }
    public void Restar(View view){
        int resultadoNumero = Integer.parseInt(numero1.getText().toString()) - Integer.parseInt(numero2.getText().toString());
        Resultado.setText(resultadoNumero + "");
    }
    public void Multiplicar(View view){
        int resultadoNumero = Integer.parseInt(numero1.getText().toString()) * Integer.parseInt(numero2.getText().toString());
        Resultado.setText(resultadoNumero + "");
    }
    public void Dividir(View view){
        int resultadoNumero = Integer.parseInt(numero1.getText().toString()) / Integer.parseInt(numero2.getText().toString());
        Resultado.setText(resultadoNumero + "");
    }
}