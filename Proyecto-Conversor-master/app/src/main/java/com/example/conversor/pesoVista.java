package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class pesoVista extends AppCompatActivity {

    Button btnVolver,btnConvertirPeso;
    TextView txtResultado;
    Spinner spinnerPeso;
    EditText txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        //Declaro las variables a los objetos
        Spinner spinnerPeso = findViewById(R.id.spinnerPeso);
        Button btnVolver = findViewById(R.id.btnVolver);
        Button btnConvertirPeso = findViewById(R.id.btnConvertirPeso);
        TextView txtResultado = findViewById(R.id.txtResultado);
        EditText txtValor = findViewById(R.id.txtValor);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Peso, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerPeso.setAdapter(adapter);

        btnConvertirPeso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                    String opcion = spinnerPeso.getSelectedItem().toString();
                    double  valor = Double.parseDouble(txtValor.getText().toString());

                if (valor=""){

                }

                if (opcion.equals("Kilogramos a Libras")) {
                    peso peso = new peso("Kilogramos", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Libras a Kilogramos")) {
                    peso peso = new peso("Libras", "Kilogramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Gramos a Libras")) {
                    peso peso = new peso("Gramos", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Libras a Gramos")) {
                    peso peso = new peso("Libras", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Kilogramos a Gramos")) {
                    peso peso = new peso("Kilogramos", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Gramos a Kilogramos")) {
                    peso peso = new peso("Gramos", "Kilogramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Kilogramos")) {
                    peso peso = new peso("Toneladas", "Kilogramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Kilogramos a Toneladas")) {
                    peso peso = new peso("Kilogramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Libras a Onzas")) {
                    peso peso = new peso("Libras", "Onzas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Onzas a Libras")) {
                    peso peso = new peso("Onzas", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Gramos a Onzas")) {
                    peso peso = new peso("Gramos", "Onzas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Onzas a Gramos")) {
                    peso peso = new peso("Onzas", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Libras")) {
                    peso peso = new peso("Toneladas", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Libras a Toneladas")) {
                    peso peso = new peso("Libras", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Gramos")) {
                    peso peso = new peso("Toneladas", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Gramos a Toneladas")) {
                    peso peso = new peso("Gramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Miligramos")) {
                    peso peso = new peso("Toneladas", "Miligramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Miligramos a Toneladas")) {
                    peso peso = new peso("Miligramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Kilogramos a Miligramos")) {
                    peso peso = new peso("Kilogramos", "Miligramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Miligramos a Kilogramos")) {
                    peso peso = new peso("Miligramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(pesoVista.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
}