package com.example.ejemploarrayliststringdobleventana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarDatos(View view) {

        Intent i = new Intent(this, Ventana2.class );


        ArrayList<String> lista = new ArrayList();  //creamos un ArrayList

        lista.add("Alonso");
        lista.add("Tovar");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Alonso");
        lista.add("Tovar");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Alonso");
        lista.add("Tovar");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Alonso");
        lista.add("Tovar");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");
        lista.add("Rey");



        i.putStringArrayListExtra("nombre", lista);

        startActivity(i);
    }

}