package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View v){
        this.opcaoSelecionada("pedra");
    }
    public void selecionadoTesoura(View v){
        this.opcaoSelecionada("tesoura");
    }
    public void selecionadoPapel(View v){
        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

    }

}