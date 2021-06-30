package com.example.ejemploarrayliststringdobleventana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Ventana2 extends AppCompatActivity {

    private TextView textoArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
    this.textoArrayList = (TextView) findViewById(R.id.textViewResultadoConsulta);

    ArrayList<String> dato = getIntent().getStringArrayListExtra("nombre");

    String cadena="";
        for(int i=0;i<dato.size();i++)
    {
        cadena+=dato.get(i)+"<BR/>";
    }


       this.textoArrayList.setText(Html.fromHtml("<p><h2>CLIENTES:</h2></p>" + cadena)
            , TextView.BufferType.SPANNABLE);

}

    public void cerrarVentana(View view) {
        finish();
    }


}