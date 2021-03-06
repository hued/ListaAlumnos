package com.ehuaranga.listaorce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerAlumnosAdapter adapter = new RecyclerAlumnosAdapter(Utils.getAlumnosUNI(), this);

        recyclerViewAlumnos = findViewById(R.id.recycler_alumnos);

        recyclerViewAlumnos.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAlumnos.setAdapter(adapter);
    }
}
