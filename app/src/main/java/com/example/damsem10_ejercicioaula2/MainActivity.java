package com.example.damsem10_ejercicioaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.button1);
            btnToast.setOnClickListener(this);

        ListView listView = findViewById(R.id.listView1);

        List<String> itemList = new ArrayList<>();
        itemList.add("Arquitectura de Computadoras");
        itemList.add("Desarrollo de Aplicaciones Moviles");
        itemList.add("Sistemas Operativos");
        itemList.add("SCRUM");
        itemList.add("Sistemas de Información");
        itemList.add("Simulacion de Sistemas");
        itemList.add("Análisis y Diseño de Sistemas");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1){
            Toast.makeText(this, "Matrícula Completa", Toast.LENGTH_SHORT).show();
        }
    }
}