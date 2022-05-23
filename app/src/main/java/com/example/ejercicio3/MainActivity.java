package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init(){
        lista=new ArrayList<>();
        lista.add(new ListElement("#751748","Maria","Monterrey","Desconectado"));
        lista.add(new ListElement("#752757","Nestor","Oaxaca","Conectado"));
        lista.add(new ListElement("#754748","Rosa","Chiapas","Conectado"));
        lista.add(new ListElement("#726548","Luz","Veracruz","Desconectado"));
        lista.add(new ListElement("#753748","Roberta","Mexico","Conectado"));
        ListAdapter list=new ListAdapter(lista,this);
        RecyclerView rv=findViewById(R.id.listRecycleView);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SELECCION: "+lista.get(rv.getChildAdapterPosition(view)).getName(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("dato",lista.get(rv.getChildAdapterPosition(view)).getName()).toString();
                i.putExtra("dato1",lista.get(rv.getChildAdapterPosition(view)).getCity()).toString();
                i.putExtra("dato2",lista.get(rv.getChildAdapterPosition(view)).getStatus()).toString();
                startActivity(i);
            }
        });

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(list);
    }
}